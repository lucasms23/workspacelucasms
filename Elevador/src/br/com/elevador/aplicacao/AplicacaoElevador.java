package br.com.elevador.aplicacao;

import br.com.elevador.modelo.elevador;

public class AplicacaoElevador {

	public static void main(String[] args) {

		elevador objeto = new elevador();
		objeto.inicializar((short) 10, (short) 12, (short) 0);
		System.out.println(objeto.verificarStatus());
		objeto.subir();
		objeto.subir();
		System.out.println(objeto.verificarStatus());
		objeto.descer();
		objeto.entrar((short) 8);
		objeto.sair();
		objeto.sair((short) 3);
		System.out.println(objeto.verificarStatus());
		
	}

}