package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestantandoClassesFilhas {
	
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gian carlos");
		aluno.setIdade(20);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("asjbbd5151sa");
		diretor.setIdade(40);
		
		Secretario secretario = new Secretario();
		secretario.setDataNascimento("15/15/185");
		secretario.setIdade(13);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade() + " - " + diretor.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade() + " - " + secretario.msgMaiorIdade());
		
		System.out.println(aluno.salario());
		System.out.println(diretor.salario());
		System.out.println(secretario.salario());
	}

}
