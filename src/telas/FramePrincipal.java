package telas;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FramePrincipal extends JFrame{
	
	public static JPanel painelConteudo = new JPanel();
	public static CardLayout cardLayout = new CardLayout();
	
	private PainelLogin painelLogin = new PainelLogin();
	private PainelMenu painelMenu = new PainelMenu();
	private PainelLivros painelLivros = new PainelLivros();
	private PainelAdicionarLivro painelAddLivro = new PainelAdicionarLivro();
	private PainelEmprestimo painelEmprestimo = new PainelEmprestimo();
	
	public FramePrincipal() {
		super("Biblioteca");
		
		painelConteudo.setLayout(cardLayout);
		
		painelConteudo.add(painelLogin, "painelLogin");
		painelConteudo.add(painelMenu, "painelMenu");
		painelConteudo.add(painelLivros, "painelLivros");
		painelConteudo.add(painelAddLivro, "painelAddLivro");
		painelConteudo.add(painelEmprestimo, "painelEmprestimo");
		
		this.setContentPane(painelConteudo);
		cardLayout.show(painelConteudo, "painelLogin");
		
		
	}	
}
