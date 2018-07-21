package controle;

import telas.FramePrincipal;;

public class ControleTelas {
	
	public void definirTela(String tela){
		FramePrincipal.cardLayout.show(FramePrincipal.painelConteudo, tela);
	}
}
