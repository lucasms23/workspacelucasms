package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {

		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1: "));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2: "));
		String operacao = JOptionPane.showInputDialog("Opera��o Desejada (+, -, * ou /): ");
		System.out.println("operacao: "+operacao);
		double total;

		if (operacao.equals("+")) {
			total = valor1 + valor2;
			System.out.println("Total: "+total);
		}else if (operacao.equals("-")) {
			total = valor1 - valor2;
			System.out.println("Total: "+total);
		}else if (operacao.equals("*")) {
			total = valor1 * valor2;
			System.out.println("Total: "+total);
		}else if (operacao.equals("/")) {
			total = valor1 / valor2;
			System.out.println("Total: "+total);
		}else {
			System.out.println("Operacao Invalida!");
		}


	}

}
