package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
	
	String disciplina = JOptionPane.showInputDialog("Digite a materia");
	float nota1 = 6.5f;
	float nota2 = 7.5f;
	float media = (nota1+nota2)/2;
	short falta = 8;
	
	System.out.println("Disciplina: "+ disciplina);
	System.out.println("Media: "+ media);
	System.out.println("Faltas: "+ falta);
	}

}
