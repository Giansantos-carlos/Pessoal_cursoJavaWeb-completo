package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String registro;
	private String nivelCargo; 
	private String experiencia;
	
	
	private String login;
	private String senha;
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
			
	}
	
	public Secretario() 	{
		
		
	}
	
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	public boolean pessoaMaiorIdade() {
		
		return idade >= 20; 
	}
		
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? " Obaa aluno e maior de idade" : "Ixii vc e menor de idade " ;
	
	}
	@Override
	public double salario() {
		
		return 3000;
	}
	
	
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.login = senha;
	
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");
	}
	



}
