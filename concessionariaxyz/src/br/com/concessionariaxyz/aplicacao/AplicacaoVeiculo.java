package br.com.concessionariaxyz.aplicacao;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("FIAT");
		objeto.preencherModelo("UNO");
		objeto.preencherValor(30000);
		objeto.preencherVelocidadeMaxima(180);
		
		System.out.println("Montadora:.........: "+objeto.retornarMontadora());
		System.out.println("Modelo.............: "+objeto.retornarModelo());
		System.out.println("Valor..............: "+objeto.retornarValor());
		System.out.println("Velocidade Máxima..: "+objeto.retornarVelocidadeMaxima());
		System.out.println(objeto.ligar());
		objeto.acelerar(200);
		objeto.acelerar();
		objeto.acelerar();
		System.out.println(objeto.verificarStatus());
		objeto.desacelerar();
		objeto.desacelerar();
		System.out.println(objeto.verificarStatus());
		System.out.println(objeto.desligar());
	}

}
