package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexaoBD {

	public Statement stPesquisa;
	public ResultSet resPesquisa;
	public Connection conn = null;
	
	private void encontrarDriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e){
			JOptionPane.showMessageDialog(null, "Impossível de conectar!");
		}		
	}
	
	public void conectar() {
		
		encontrarDriver();
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "123456");
			
			System.out.print("conectou");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Impossível de conectar!");
		}
	}
	
	public void desconectar() {
		try {
			conn.close();
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, "Aconteceu um erro!");
		}
	}
	
	public void executaSql(String sql) {	
		try {
			stPesquisa = conn.createStatement(resPesquisa.TYPE_SCROLL_INSENSITIVE, resPesquisa.CONCUR_READ_ONLY);
			resPesquisa = stPesquisa.executeQuery(sql);
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Impossível de conectar!");
		}
	}
}
