package cursojava.executavel;

public class Matriz {
	
	
	// executar o codigo java
	public static void main(String[] args) {
		
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 180;
		notas[0][1] = 176;
		notas[0][2] = 159;
		
		notas[1][0] = 80;
		notas[1][1] = 76;
		notas[1][2] = 59;
		
		
		System.out.println(notas);
		
		
		for (int poslinha = 0;  poslinha < notas.length; poslinha ++) { // perorre as linhas 
			System.out.println("===========================================================");		
			// pecorrer as  colunas
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna ++) {
				System.out.println("Valor da Matriz: " + notas[poslinha][poscoluna]);
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	

}
