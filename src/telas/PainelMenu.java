package telas;

import javax.swing.JPanel;

import app.ClassePrincipal;
import controle.ControleTelas;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelMenu extends JPanel {
	
	public PainelMenu() {
		
		setLayout(null);
		
		JLabel lblBemvindo = new JLabel("Bem-vindo ");
		lblBemvindo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBemvindo.setBounds(10, 11, 283, 39);
		add(lblBemvindo);
		
		JLabel lblRegistros = new JLabel("Registros");
		lblRegistros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegistros.setBounds(65, 157, 118, 25);
		add(lblRegistros);
		
		JButton btnAlunos = new JButton("Alunos cadastrados");
		btnAlunos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlunos.setBounds(65, 261, 187, 23);
		add(btnAlunos);
		
		JButton btnEmprestimos = new JButton("Empr\u00E9stimo de livros");
		btnEmprestimos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEmprestimos.setBounds(65, 193, 187, 23);
		add(btnEmprestimos);
		
		JButton btnEstoque = new JButton("Estoque de livros");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControleTelas controleTelas = new ControleTelas();
				controleTelas.definirTela("painelLivros");
			}
		});
		btnEstoque.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEstoque.setBounds(65, 227, 187, 23);
		add(btnEstoque);
		
		JButton btnFuncionarios = new JButton("Funcion\u00E1rios cadastrados");
		btnFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFuncionarios.setBounds(65, 295, 187, 23);
		add(btnFuncionarios);
		
		JButton btnMudarSenha = new JButton("Mudar senha");
		btnMudarSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMudarSenha.setBounds(65, 417, 187, 23);
		add(btnMudarSenha);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setBounds(65, 529, 187, 23);
		add(btnSair);
		
		JLabel lblConfig = new JLabel("Configura\u00E7\u00F5es");
		lblConfig.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConfig.setBounds(65, 381, 139, 25);
		add(lblConfig);
	}

}
