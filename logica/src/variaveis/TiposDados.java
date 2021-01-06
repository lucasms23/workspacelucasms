package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String nome = JOptionPane.showInputDialog("digite o nome");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("digite a idade"));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("digite a altura"));
	double peso = Double.parseDouble(JOptionPane.showInputDialog("digite o peso"));
	double imc = peso / (altura * altura);
	
	System.out.println("Nome...: "+ nome);
	System.out.println("Idade..: "+ idade);
	System.out.println("Altura.: "+ altura);
	System.out.println("Peso...: "+ peso);
	System.out.println("IMC....: "+ imc);
	}

}
