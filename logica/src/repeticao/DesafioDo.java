package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {

		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 - Digite um numero: "));
		int jogador2 = 0;
		int tentativas = 0;
		do {
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 - Tente acertar o numero do Jogador 1: "));
			tentativas=tentativas+1;
			if (jogador1 != jogador2) {
				if (jogador2 > jogador1) {
					JOptionPane.showMessageDialog(null, "DICA: Jogador 2, o n�mero do Jogador1 � menor");
				}else JOptionPane.showMessageDialog(null, "DICA: Jogador 2, o n�mero do Jogador1 � maior");
			}
		}while (jogador1 != jogador2);
		JOptionPane.showMessageDialog(null, "PARABENS JOGADOR 2 !!!!! Voc� acertou em "+tentativas+" tentativas!");
	}

}
