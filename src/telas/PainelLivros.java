package telas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import controle.ControleTelas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelLivros extends JPanel {
	private JTextField txtPesquisar;
	private JTable tblResultado;

	public PainelLivros() {
		
		setLayout(null);
		setSize(1000, 600);
		
		JLabel lblLivros = new JLabel("Registro de livros");
		lblLivros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLivros.setBounds(41, 35, 407, 46);
		add(lblLivros);
		
		JComboBox comboFiltro = new JComboBox();
		comboFiltro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboFiltro.setModel(new DefaultComboBoxModel(new String[] {"Nome do livro", "Autor", "Editora"}));
		comboFiltro.setBounds(136, 94, 163, 20);
		add(comboFiltro);
		
		JLabel lblPesquisa = new JLabel("Pesquisar por");
		lblPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPesquisa.setBounds(41, 96, 100, 17);
		add(lblPesquisa);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setBounds(41, 134, 407, 20);
		add(txtPesquisar);
		txtPesquisar.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPesquisar.setBounds(461, 133, 216, 23);
		add(btnPesquisar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 167, 636, 217);
		add(scrollPane);
		
		tblResultado = new JTable();
		tblResultado.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Qtd"
			}
		));
		scrollPane.setViewportView(tblResultado);
		
		JButton btnAdicionarNovoLivro = new JButton("Adicionar novo livro");
		btnAdicionarNovoLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleTelas controleTelas = new ControleTelas();
				controleTelas.definirTela("painelAddLivro");
			}
		});
		btnAdicionarNovoLivro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdicionarNovoLivro.setBounds(41, 395, 168, 23);
		add(btnAdicionarNovoLivro);
		
		JButton btnModificarSelecionado = new JButton("Consultar mais detalhes");
		btnModificarSelecionado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnModificarSelecionado.setBounds(219, 395, 189, 23);
		add(btnModificarSelecionado);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterar.setBounds(418, 395, 120, 23);
		add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.setBounds(548, 395, 129, 23);
		add(btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleTelas controleTelas = new ControleTelas();
				controleTelas.definirTela("painelMenu");
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(41, 537, 216, 23);
		add(btnVoltar);
	}
}
