package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Email invalido. Digite o email novamente.").toLowerCase();
		}
		System.out.println("Seja bem vindo: "+email.substring(0,email.indexOf("@")));
	}

}