package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		
		//String produto = JOptionPane.showInputDialog("Produto: ");
		double qtde = Float.parseFloat(JOptionPane.showInputDialog("Quantidade: "));
		double valor = Float.parseFloat(JOptionPane.showInputDialog("Valor Unit�rio: "));
		
		if (qtde >= 10 && qtde <= 20) {
			double valor_novo = valor - (valor * 0.10);
			System.out.println("Valor atualizado: "+valor_novo);
		}else if (qtde >= 5 && qtde <= 9) {
			double valor_novo = valor - (valor * 0.05);
			System.out.println("Valor atualizado: "+valor_novo);
		}else if (qtde < 5) {
			double valor_novo = valor;
			System.out.println("Valor atualizado: "+valor_novo);
		}else if (qtde > 20) {
			double valor_novo = valor - (valor * 0.12);
			System.out.println("Valor atualizado: "+valor_novo);
		}
		
		//System.out.println("Valor atualizado: "+valor_novo);
	}

}
