package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio4 {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3: "));
		
		if (valor1==valor2 || valor1==valor3 || valor2==valor3) {
			System.out.println("Existem valores iguais");
		}else {
		int ord1=0;
		int ord2;
		int ord3;


		System.out.println("valor 1: "+valor1);
		System.out.println("valor 2: "+valor2);
		System.out.println("valor 3: "+valor3);

		if (valor1 > valor2 && valor1 > valor3 ) {
			ord1 = valor1;
			if (valor2 > valor3) {
				ord2 = valor2;
				ord3 = valor3;
			}else {
				ord2 = valor3;
				ord3 = valor2;
			}
		}else 
			if (valor2 > valor1 && valor2 > valor3 ) {
				ord1 = valor2;
				if (valor1 > valor3) {
					ord2 = valor1;
					ord3 = valor3;
				}else {
					ord2 = valor3;
					ord3 = valor1;	
				}
			}else
				if (valor3 > valor1 && valor3 > valor2 ) {
					ord1 = valor3;
					if (valor1 > valor2) {
						ord2 = valor1;
						ord3 = valor2;
					}else {
						ord2 = valor2;
						ord3 = valor1;					
					}
					
					System.out.println("Ordenado: "+ord1+" "+ord2+" "+ord3);
					/*System.out.println("\n\nOrdenado:\n");
					System.out.println(ord1);
					System.out.println(ord2);
					System.out.println(ord3);*/
				}
		}
	}

}