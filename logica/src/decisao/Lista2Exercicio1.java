package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
	
		double diaria = 80;
		double qtde = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Diarias: "));
		double taxa;
		
		if (qtde > 15) {
		taxa = 5.5 * qtde;
		}else if (qtde == 15) {
			taxa = 6 * qtde;
		}else {
			taxa = 8 * qtde;
		}
		
		double total = (diaria * qtde) + taxa;
		
		System.out.println("Total a pagar: "+total);
		

	}

}
