package br.com.elevador.modelo;

public class elevador {
	private short capacidadeMaxima;
	private short andarMaximo;
	private short andarMinimo;
	private short qtdePessoas;
	private short andarAtual;
	
	//Sintaxe dos metodos
	// <modificado> <tipo do retorno> <nome do método> (<tipo do param> <nome do param>
	
	public void inicializar (short capacidade, short maior, short menor) {
		capacidade = capacidadeMaxima;
		maior = andarMaximo;
		menor = andarMinimo;	
	}

	public String verificarStatus () {
	return "\nQuantidade de Pessoas: "+qtdePessoas+"\nAndar Atual: "+andarAtual+"\nCapacidade Maxima: "+capacidadeMaxima;
	}
	
	public void subir () {
		andarAtual++;
	}
	
	public void descer () {
		andarAtual--;
	}
	
	public void entrar (short param) {
		qtdePessoas = (short) (qtdePessoas+param);
	}
	
	public void sair () {
		qtdePessoas--;
	}
	
	public void sair (short param) {
		qtdePessoas = (short) (qtdePessoas-param);
	}
}
