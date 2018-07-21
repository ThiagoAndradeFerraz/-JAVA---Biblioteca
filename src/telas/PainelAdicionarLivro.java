package telas;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class PainelAdicionarLivro extends JPanel {
	private JTextField textField;
	private JTextField txtPesquisaAutor;
	private JTextField txtNomeAutor;
	private JTable tableAutor;
	private JTextField txtPesquisaEditora;
	private JTextField txtEditora;
	private JTable tableEditora;
	private JButton btnSelecionar, btnAddAutor, btnSelecionarEditora, btnAddEditora;
	
	/**
	 * Create the panel.
	 */
	public PainelAdicionarLivro() {
		setSize(1000, 700);
		setLayout(null);
		
		JLabel lblAddLivro = new JLabel("Cadastrar novo livro");
		lblAddLivro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAddLivro.setBounds(41, 35, 407, 46);
		add(lblAddLivro);
		
		JLabel lblNewLabel = new JLabel("Nome do livro:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(41, 92, 118, 19);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(142, 93, 383, 20);
		add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnSelecionarAutor = new JRadioButton("Selecionar autores j\u00E1 cadastrados");
		rdbtnSelecionarAutor.setSelected(true);
		rdbtnSelecionarAutor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ativarSelecionar(true);
				ativarAdd(false);
			}
		});
		rdbtnSelecionarAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnSelecionarAutor.setBounds(41, 130, 214, 23);
		add(rdbtnSelecionarAutor);
		
		JRadioButton rdbtnAdicionarNovoAutor = new JRadioButton("Adicionar novo autor");
		rdbtnAdicionarNovoAutor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ativarAdd(true);
				ativarSelecionar(false);
			}
		});
		rdbtnAdicionarNovoAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnAdicionarNovoAutor.setBounds(580, 130, 214, 23);
		add(rdbtnAdicionarNovoAutor);
		
		ButtonGroup bgAutores = new ButtonGroup();
		bgAutores.add(rdbtnSelecionarAutor);
		bgAutores.add(rdbtnAdicionarNovoAutor);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(41, 190, 484, 108);
		add(scrollPane);
		
		tableAutor = new JTable();
		tableAutor.setEnabled(false);
		tableAutor.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Autor"
			}
		));
		scrollPane.setViewportView(tableAutor);
		
		JLabel lblPesquisarAutor = new JLabel("Pesquisar autor:");
		lblPesquisarAutor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPesquisarAutor.setBounds(41, 160, 118, 19);
		add(lblPesquisarAutor);
		
		txtPesquisaAutor = new JTextField();
		txtPesquisaAutor.setColumns(10);
		txtPesquisaAutor.setBounds(152, 161, 374, 20);
		add(txtPesquisaAutor);
		
		JLabel lblNomeDoAutor = new JLabel("Nome do autor:");
		lblNomeDoAutor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeDoAutor.setBounds(580, 160, 118, 19);
		add(lblNomeDoAutor);
		
		txtNomeAutor = new JTextField();
		txtNomeAutor.setEnabled(false);
		txtNomeAutor.setColumns(10);
		txtNomeAutor.setBounds(580, 190, 374, 20);
		add(txtNomeAutor);
		
		btnAddAutor = new JButton("Adicionar");
		btnAddAutor.setEnabled(false);
		btnAddAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAddAutor.setBounds(580, 221, 214, 23);
		add(btnAddAutor);
		
		btnSelecionar = new JButton("Selecionar");
		btnSelecionar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSelecionar.setBounds(41, 309, 228, 23);
		add(btnSelecionar);
		
		btnSelecionarEditora = new JButton("Selecionar");
		btnSelecionarEditora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSelecionarEditora.setBounds(41, 553, 228, 23);
		add(btnSelecionarEditora);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(41, 434, 484, 108);
		add(scrollPane_1);
		
		tableEditora = new JTable();
		tableEditora.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Editora"
			}
		));
		scrollPane_1.setViewportView(tableEditora);
		
		txtPesquisaEditora = new JTextField();
		txtPesquisaEditora.setColumns(10);
		txtPesquisaEditora.setBounds(164, 405, 362, 20);
		add(txtPesquisaEditora);
		
		JLabel lblPesquisarEditora = new JLabel("Pesquisar editora:");
		lblPesquisarEditora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPesquisarEditora.setBounds(41, 404, 118, 19);
		add(lblPesquisarEditora);
		
		JRadioButton rbtnSelecionarEditora = new JRadioButton("Selecionar editora j\u00E1 cadastrada");
		rbtnSelecionarEditora.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ativarSelecionarEditora(true);
				ativarAddEditora(false);
			}
		});
		rbtnSelecionarEditora.setSelected(true);
		rbtnSelecionarEditora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbtnSelecionarEditora.setBounds(41, 374, 214, 23);
		add(rbtnSelecionarEditora);
		
		JRadioButton rdbtnAdcionarNovaEditora = new JRadioButton("Adcionar nova editora");
		rdbtnAdcionarNovaEditora.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ativarAddEditora(true);
				ativarSelecionarEditora(false);
			}
		});
		rdbtnAdcionarNovaEditora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnAdcionarNovaEditora.setBounds(580, 374, 214, 23);
		add(rdbtnAdcionarNovaEditora);
		
		ButtonGroup bgEditora = new ButtonGroup();
		bgEditora.add(rbtnSelecionarEditora);
		bgEditora.add(rdbtnAdcionarNovaEditora);
		
		JLabel lblNomeDaEditora = new JLabel("Nome da editora:");
		lblNomeDaEditora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeDaEditora.setBounds(580, 404, 133, 19);
		add(lblNomeDaEditora);
		
		txtEditora = new JTextField();
		txtEditora.setEnabled(false);
		txtEditora.setColumns(10);
		txtEditora.setBounds(580, 434, 374, 20);
		add(txtEditora);
		
		btnAddEditora = new JButton("Adicionar");
		btnAddEditora.setEnabled(false);
		btnAddEditora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAddEditora.setBounds(580, 465, 214, 23);
		add(btnAddEditora);
		
		JButton btnNewButton_1 = new JButton("Cadastrar livro");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(41, 617, 324, 23);
		add(btnNewButton_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(787, 617, 167, 23);
		add(btnVoltar);
	}
	
	private void ativarSelecionar(boolean valor) {
		txtPesquisaAutor.setEnabled(valor);
		btnSelecionar.setEnabled(valor);
		tableAutor.setEnabled(valor);
	}
	
	private void ativarAdd(boolean valor) {
		txtNomeAutor.setEnabled(valor);
		btnAddAutor.setEnabled(valor);
	}
	
	private void ativarSelecionarEditora(boolean valor) {
		txtPesquisaEditora.setEnabled(valor);
		tableEditora.setEnabled(valor);
		btnSelecionarEditora.setEnabled(valor);
	}
	
	private void ativarAddEditora(boolean valor) {
		txtEditora.setEnabled(valor);
		btnAddEditora.setEnabled(valor);
	}
}
