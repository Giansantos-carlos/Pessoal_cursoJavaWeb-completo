package cursojava.thread;

import javax.swing.JOptionPane;

public class aulaThread {

	public static void main(String[] args) throws InterruptedException {
		// Thread de Processamento em paralelo do envio de email//
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		// Satarr liga a thread que fica procesando por tras//

		// *********************Disvisao de treads******************//
		// Thread de rocessamento em paralelo do envio de notas fiscaisl//
		Thread threadNFC = new Thread(thread2);
		threadNFC.start();

		// fim do codigo em paralelo//

		// codigo =do sitema do usuario continua o fluxo de trabalho//

		System.out.println("Chegou ao fim esse codigo de thread");
		// Fluxo de sistema, cadastro de vendas, uma emissao de nota fiscal oun algo do
		// tipo//
		JOptionPane.showMessageDialog(null, "Sisema continua executando pelo usuaria");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {// executa o que nos queremos //
			// codigo da rotina //
			// codigo da rotima de execucao paralela//
			for (int pos = 0; pos < 10; pos++) {

				System.out.println("Executando algp na rotina, por Exenplço email ");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // da um tempo //

			}

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {// executa o que nos queremos //
			// codigo da rotina //
			// codigo da rotima de execucao paralela//
			for (int pos = 0; pos < 10; pos++) {

				System.out.println("Executando algp na rotina, por Exenplço envio de notas ficais ");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // da um tempo //

			}

		}
	};

}
