package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controle.ConexaoBD;
import controle.ControleTelas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PainelLogin extends JPanel {
	private JTextField txtUsuario;
	private JTextField txtSenha;
	
	ConexaoBD conectarBD = new ConexaoBD();

	public int x, y;
	
	public PainelLogin() {
		
		conectarBD.conectar();
		
		setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLogin.setBounds(48, 37, 132, 37);
		add(lblLogin);
		
		JLabel lblUsurio = new JLabel("Usuário:");
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsurio.setBounds(48, 86, 78, 27);
		add(lblUsurio);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(116, 92, 323, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSenha.setBounds(48, 124, 78, 27);
		add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(116, 130, 323, 20);
		add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ControleTelas controleTelas = new ControleTelas();
				controleTelas.definirTela("painelMenu");
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEntrar.setBounds(48, 168, 187, 20);
		add(btnEntrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setBounds(252, 168, 187, 20);
		add(btnSair);
	}
}
