package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {

		//String nome = JOptionPane.showInputDialog("Nome: ");
		float idade = Float.parseFloat(JOptionPane.showInputDialog("Idade: "));
		
		if (idade > 70 || idade == 16 || idade ==17) {
			System.out.println("Voto facultativo");
		}
		if (idade < 16) {
			System.out.println("N�o vota");
		}		
		if (idade >= 18 && idade <= 70) {
			System.out.println("Obrigado a votar");
		}	
	}

}
