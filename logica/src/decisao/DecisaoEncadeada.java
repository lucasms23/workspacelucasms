package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina: ");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float falta = Float.parseFloat(JOptionPane.showInputDialog("Numero de Falta(s)"));
		float media = (nota1+nota2)/2;
		
		if (media>=6 && falta < 20) {
			System.out.println("Parabens, foi aprovada na displina "+disciplina);
		}else if (media<4 || falta >= 20) {
			System.out.println("Infelizmente voc� foi reprovado na displina "+disciplina);
		}else if (media>=4 && media <6) {
			System.out.println("Voc� est� de recupera��o na displina "+disciplina);
		}		
		System.out.println("M�dia: "+media);

	}

}