package app;

import javax.swing.JFrame;

import telas.FramePrincipal;

public class ClassePrincipal {
	
	public static void main(String[] args) {
		
		FramePrincipal frame = new FramePrincipal();
		frame.setSize(1000, 700);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
}
