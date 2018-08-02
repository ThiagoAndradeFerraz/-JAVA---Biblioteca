package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import modelos.ModeloAutor;
import net.proteanit.sql.DbUtils;

public class ControleAutor {

	public ConexaoBD conexao = new ConexaoBD();
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public void salvar(ModeloAutor modAutor) {
		
		conexao.conectar();
		
		//PreparedStatement pst = null;
		
		try {
			pst = conexao.conn.prepareStatement("insert into autores(id_autor, nome_autor) values(seq_id_autor.nextval, ?)");
			pst.setString(1, modAutor.getNomeAutor());
			pst.execute();
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
		} catch (SQLException e) {		
			JOptionPane.showMessageDialog(null, "Os dados não foram inseridos!");
		}
		
		conexao.desconectar();
	}
	
	public List<ModeloAutor> consultar(String nome, int tipo){
		
		// 0 <- CONSULTAR TODOS OS AUTORES
		// 1 <- CONSULTA POR AUTOR ESPECIFICO
		
		conexao.conectar();
		
		String consultaPadrao = "SELECT * FROM autores";
		String buscaEspecifica = "SELECT * FROM autores WHERE nome_autor LIKE ?";
		
		List<ModeloAutor> autores = new ArrayList<>();
		
		try {
			
			if(tipo < 1) {
				pst = conexao.conn.prepareStatement(consultaPadrao);
			}
			else {
				pst = conexao.conn.prepareStatement(buscaEspecifica);
				pst.setString(1, "%" + nome + "%");
			}
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				
				ModeloAutor autor = new ModeloAutor();
				
				autor.setIdAutor(rs.getInt("id_autor"));
				autor.setNomeAutor(rs.getString("nome_autor"));
				autores.add(autor);
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Impossível consultar!");
		} finally {
			conexao.desconectar();
		}
		
		return autores;
	}
	
}
