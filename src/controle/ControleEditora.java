package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelos.ModeloEditora;

public class ControleEditora {

	
	ConexaoBD conexao = new ConexaoBD();
	
	public void Salvar(ModeloEditora modEditora) {
		
		conexao.conectar();
		
		try {
			PreparedStatement pst = conexao.conn.prepareStatement("insert into editoras(id_editora, nome_editora) values(seq_id_editora.nextval, ?)");
			pst.setString(1, modEditora.getNomeEditora());
			pst.execute();
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
		} catch (SQLException e) {		
			JOptionPane.showMessageDialog(null, "Os dados não foram inseridos!");
		}
		conexao.desconectar();
	}
}
