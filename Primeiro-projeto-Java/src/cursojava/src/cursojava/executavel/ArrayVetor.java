package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		
		
		
    double[] notas = {8.8,7.6,7.9,8.4};
    double[] notasLogica = {7.8,6.6,7.2,8.4};
    
	/*Criacao de alunos*/	
    
	Aluno aluno = new Aluno();
	aluno.setNome("Gian Carlos Dos Santos");
	aluno.setNomeEscola("Jdve treinamento");
	
	// criacao de disciplina//
	
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("curso java");
	disciplina.setNota(notas); 
	
	aluno.getDisciplinas().add(disciplina);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("Logica de programação");
	disciplina2.setNota(notasLogica); 
	
	
	aluno.getDisciplinas().add(disciplina2);
	
	
//----------------------------------------------------------------------------------------------------
	
	Aluno aluno2 = new Aluno();
	aluno2.setNome("Gian Carlos Dos Santos 2");
	aluno2.setNomeEscola("Jdve treinamento 2");
	
	// criacao de disciplina//
	
	Disciplina disciplina3 = new Disciplina();
	disciplina3.setDisciplina("curso java 2");
	disciplina3.setNota(notas); 
	
	aluno2.getDisciplinas().add(disciplina3);
	
	Disciplina disciplina4 = new Disciplina();
	disciplina4.setDisciplina("Logica de programação 2");
	disciplina4.setNota(notasLogica); 
	
	
	aluno2.getDisciplinas().add(disciplina2);
	
	
	//----------------------------------------------------------------------------------------------
	
	
	Aluno[] arrayAlunos = new Aluno[2];
	
	arrayAlunos[0] = aluno;
	arrayAlunos[1] = aluno2;
	
	
	for (int pos = 0; pos < arrayAlunos.length; pos ++) {
		System.out.println("Nome do aluno e: " + arrayAlunos[pos].getNome());
		
		
		for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Nome da disciplna e :" + d.getDisciplina());
			
			for (int posnota = 0; posnota < d.getNota().length; posnota ++ ) {
				System.out.println("A nota numero : " + posnota + " e igual = " + d.getNota()[posnota]);
				
				
			}
		}
		
	}
	
	
	
	
	
	
	
	

 }
	
}
