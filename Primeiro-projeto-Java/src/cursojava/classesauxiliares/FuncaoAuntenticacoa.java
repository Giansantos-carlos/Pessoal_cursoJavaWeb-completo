package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAuntenticacoa {
	
	

	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
		
	
	}
	
	public FuncaoAuntenticacoa(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
		
	}


	
	
	}
