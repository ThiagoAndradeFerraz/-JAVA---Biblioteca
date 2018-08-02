package telas;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelEmprestimo extends JPanel {

	public PainelEmprestimo() {
		setSize(1000, 700);
		setLayout(null);
		
		JLabel lblEmprestimos = new JLabel("Empréstimos: ");
		lblEmprestimos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmprestimos.setBounds(41, 35, 407, 46);
		add(lblEmprestimos);
	}

}
