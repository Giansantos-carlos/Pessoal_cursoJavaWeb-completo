package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{
	
	private String Registroeducacao;
	private int TempoDirecao;
	private String Titulacao;
	
	
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	
	public Diretor() {
		
	}	
	
	public String getRegistroeducacao() {
		
		
		return Registroeducacao;
	}
	
	
	
	public void setRegistroeducacao(String registroeducacao) {
		Registroeducacao = registroeducacao;
	}
	public int getTempoDirecao() {
		return TempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		TempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return Titulacao;
	}
	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [Registroeducacao=" + Registroeducacao + ", TempoDirecao=" + TempoDirecao + ", Titulacao="
				+ Titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	public boolean pessoaMaiorIdade() {
		
		return idade >= 40;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? " Obaa aluno e maior de idade" : "Ixii vc e menor de idade " ;
		
	}
	@Override
	public double salario() {
		
		return 6000;
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
