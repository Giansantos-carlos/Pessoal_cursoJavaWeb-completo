package cursojava.thread;

import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ImplementacaoFilaThread extends Thread{
	
	
	public static ConcurrentLinkedQueue<ObjetoFilathread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilathread>();
	
	public static void add(ObjetoFilathread objetoFilathread) {
		pilha_fila.add(objetoFilathread);
		
		
	}
	
	@Override
	public void run() {
		
		System.out.println("fila rodando");
		
		
		while(true) {
		
		
		synchronized(pilha_fila) { // BVloquear o acesso desta lista de outro prcessos 
			
			java.util.Iterator<ObjetoFilathread> iteracao = pilha_fila.iterator();
			
			while (iteracao.hasNext()) { //enquento tiver dados na lista ira processar 
				
				ObjetoFilathread processar = iteracao.next();
				
				//processar 10 mil notas fiscais
				//gerar um lista ernome de PDF
				//gerar um envio de email em massa
				
				
				System.out.println("--------------------------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		try {
			Thread.sleep(1000);// Dar um tempo para descarga de memoria
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}
	


}
