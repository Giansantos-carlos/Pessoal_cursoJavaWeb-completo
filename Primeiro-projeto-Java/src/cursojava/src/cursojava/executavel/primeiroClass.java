package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAuntenticacoa;
import cursojava.constantes.StatusAluno;

public class primeiroClass {

	/* main e um metodo auto executavel em java */
	public static void main(String[] args) {
		
		String login =  JOptionPane.showInputDialog("iforme o login");
		String senha =  JOptionPane.showInputDialog("iforme a senha");
		
		
		
		
		
		
		
		if (new FuncaoAuntenticacoa(new Diretor(login, senha)).autenticar())  {
		
		

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		HashMap<String, List <Aluno>> maps = new HashMap<String, List<Aluno>>();
		

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual sua idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
			 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual é o CPF?"); String mae =
			 * JOptionPane.showInputDialog("Nome mãe?"); String pai =
			 * JOptionPane.showInputDialog("Nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula?"); String serie =
			 * JOptionPane.showInputDialog("Qual serie"); String escola =
			 * JOptionPane.showInputDialog("Nome da escola");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina" + pos + "?");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {

				int continuarRemover = 0;

				while (continuarRemover == 0) {
					int posicao = 1;
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina1, 2, 3, ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");

				}

			}

			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
	
		for (Aluno aluno : alunos) {
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else 
			if 	(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
		    }else
		    if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
		    	maps.get(StatusAluno.REPROVADO).add(aluno);
		    	
		    }	
				
		}
		
		System.out.println("-----------------------Lista de aprovados-------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com media de = " + aluno.getMedianota());
		}
		
		System.out.println("-----------------------Lista de Recuperacao-------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com media de = " + aluno.getMedianota());
		}
		
		System.out.println("-----------------------Lista de Reprovados-------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com media de = " + aluno.getMedianota());
		}


	}else {
		
		JOptionPane.showMessageDialog(null, "Acesso nao autorizado");
	}	
	}
		

		
}

