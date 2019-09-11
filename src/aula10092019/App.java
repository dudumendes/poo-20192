package aula10092019;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Ola Mundo");
		
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		
		JOptionPane.showMessageDialog(null, "Ola, " + nome);
		
		String idadeTxt = JOptionPane.showInputDialog("Qual sua idade?");
		int idade = Integer.parseInt(idadeTxt);
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?"));
		
		System.exit(0);
		
	}
}
