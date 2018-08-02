package telas;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

import controle.*;
import modelos.*;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class PainelAdicionarLivro extends JPanel {
	private JTextField txtNomeLivro;
	private JTable tblAutor, tableEditora;
	private JButton btnSelecionarEditora;
	
	ModeloAutor modAutor = new ModeloAutor();
	ControleAutor controleAutor = new ControleAutor();
	
	ModeloEditora modEditora = new ModeloEditora();
	ControleEditora controleEditora = new ControleEditora();
	
	
	
	ConexaoBD conexao = new ConexaoBD();
	
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
		
		txtNomeLivro = new JTextField();
		txtNomeLivro.setBounds(142, 93, 383, 20);
		add(txtNomeLivro);
		txtNomeLivro.setColumns(10);
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(41, 166, 484, 108);
		add(scrollPane);
		
		tblAutor = new JTable();
		tblAutor.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Autor"
			}
		));
		scrollPane.setViewportView(tblAutor);
		
		JLabel lblPesquisarAutor = new JLabel("Selecionar autores:");
		lblPesquisarAutor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPesquisarAutor.setBounds(41, 136, 149, 19);
		add(lblPesquisarAutor);
		
		btnSelecionarEditora = new JButton("Selecionar");
		btnSelecionarEditora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSelecionarEditora.setBounds(41, 553, 228, 23);
		add(btnSelecionarEditora);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(41, 340, 484, 108);
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
		
		JLabel lblSelecionarEditora = new JLabel("Selecionar editora:");
		lblSelecionarEditora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelecionarEditora.setBounds(41, 310, 118, 19);
		add(lblSelecionarEditora);
		
		JButton btnNewButton_1 = new JButton("Cadastrar livro");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(41, 617, 324, 23);
		add(btnNewButton_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControleTelas controleTelas = new ControleTelas();
				controleTelas.definirTela("painelLivros");
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(787, 617, 167, 23);
		add(btnVoltar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//fillJTableAutor("SELECT FROM AUTORES WHERE ");
			}
		});
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPesquisar.setBounds(549, 75, 164, 23);
		add(btnPesquisar);
		
		JButton btnPesquisarPorNome = new JButton("Pesquisar por nome");
		btnPesquisarPorNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String strAutor = JOptionPane.showInputDialog(null, "Nome do autor:", "Pesquisar autor por nome", JOptionPane.INFORMATION_MESSAGE);
				
				
				if((strAutor != null) && (strAutor.length() > 0)) {
					preencherTabelaAutor(strAutor, 1);
				}
				else {
					preencherTabelaAutor("", 0);
				}
			}
		});
		btnPesquisarPorNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPesquisarPorNome.setBounds(549, 166, 247, 23);
		add(btnPesquisarPorNome);
		
		JButton btnGerenciarAutores = new JButton("Gerenciar registro de autores");
		btnGerenciarAutores.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGerenciarAutores.setBounds(549, 224, 247, 23);
		add(btnGerenciarAutores);
		
		JButton btnAdicionarAutorSelecionado = new JButton("Adicionar autor selecionado");
		btnAdicionarAutorSelecionado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdicionarAutorSelecionado.setBounds(549, 251, 247, 23);
		add(btnAdicionarAutorSelecionado);
		
		JButton btnPesquisarEditora = new JButton("Pesquisar por nome");
		btnPesquisarEditora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPesquisarEditora.setBounds(549, 359, 247, 23);
		add(btnPesquisarEditora);
		
		JButton btnGerenciarRegistroDe = new JButton("Gerenciar registro de editoras");
		btnGerenciarRegistroDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGerenciarRegistroDe.setBounds(549, 387, 247, 23);
		add(btnGerenciarRegistroDe);
		
		JButton btnAdicionarEditoraSelecionada = new JButton("Adicionar editora selecionada");
		btnAdicionarEditoraSelecionada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdicionarEditoraSelecionada.setBounds(549, 414, 247, 23);
		add(btnAdicionarEditoraSelecionada);
		
		JButton btnAtualizarTabela = new JButton("Atualizar tabela");
		btnAtualizarTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				preencherTabelaAutor("", 0);
			}
		});
		btnAtualizarTabela.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAtualizarTabela.setBounds(549, 190, 247, 23);
		add(btnAtualizarTabela);
		
		preencherTabelaAutor("", 0);
	}
	
	
	public void preencherTabelaAutor(String nome, int tipo) {
		
		// 0 <- CONSULTAR TODOS OS AUTORES
		// 1 <- CONSULTA POR AUTOR ESPECIFICO
		
		DefaultTableModel modeloTabela = (DefaultTableModel) tblAutor.getModel();
		modeloTabela.setNumRows(0);
		
		controleAutor = new ControleAutor();
		
		for(ModeloAutor autor: controleAutor.consultar(nome, tipo)) {
			
			modeloTabela.addRow(new Object[] {
					autor.getIdAutor(),
					autor.getNomeAutor()
			});
		}
	}	
}
