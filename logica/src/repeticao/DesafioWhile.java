package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome");
		while (nome.length() < 5 || nome.length() > 20 && nome.contains(" ")==false) {
			nome = JOptionPane.showInputDialog("Nome inválido. Digite o nome novamente");
		}
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		while (idade < 18 || idade > 80) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade inválida. Digite a idade novamente"));
		}
		
		System.out.println("Nome........: "+nome.substring(0, nome.indexOf(" ")));
		System.out.println("Sobrenome...: "+nome.substring(nome.indexOf(" ")+1));
		System.out.println("Idade.......: "+idade);

		
	}

}
