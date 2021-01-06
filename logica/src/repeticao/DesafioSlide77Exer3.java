package repeticao;

import javax.swing.JOptionPane;

public class DesafioSlide77Exer3 {

	public static void main(String[] args) {
		int cont = 0;
		int idade_idoso=0;
		int idade_jovem=0;
		int idade = 0;
		int maiores = 0;
		int somaidade = 0;
		String idoso=" ";
		String jovem=" ";
		do {
			String nome = JOptionPane.showInputDialog("Digite o nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			cont++;
			somaidade = somaidade+idade;
					if (idade >= 18) {
						maiores++;
					}
					if (idade > idade_idoso) {
						idade_idoso = idade;
						idoso=nome;
					}
					if (idade < idade_jovem || cont==1) {
						idade_jovem = idade;
						jovem=nome;
					}

		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		JOptionPane.showMessageDialog(null, "Maiores de idade: "+(maiores)+"\nMedia idades: "+(somaidade/cont)+"\nMais Velho(a): "+idoso+ " com "+idade_idoso+" anos\n"+"Mais Jovem: "+jovem+" com "+idade_jovem+" anos");
	}

}
