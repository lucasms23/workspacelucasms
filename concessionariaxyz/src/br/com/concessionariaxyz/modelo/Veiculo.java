package br.com.concessionariaxyz.modelo;

public class Veiculo {

	private String montadora;
	private String modelo;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean status;
	private float valor;
	
	
	//Sintaxe dos metodos
	// <modificado> <tipo do retorno> <nome do método> (<tipo do param> <nome do param>
	
	public void acelerar (float param) {
		if ((velocidadeAtual+param)<velocidadeMaxima && status==true) {
			velocidadeAtual+=param;
		}
	}
	
	public String verificarStatus() {
		return "Ligado?"+status+"\nVelocidade atual: "+velocidadeAtual;
	}
	
	public void desacelerar() {
		if (velocidadeAtual>0 && status==true) {
		velocidadeAtual-=10;
		}
	}
	
	public void acelerar() {
		if ((velocidadeAtual+10)<velocidadeMaxima && status==true) {
		velocidadeAtual+=10;
		}
	}
	
	public String desligar () {
		if (status==true) {
			status=false;
			velocidadeAtual=0;
		}
		return "Veículo desligado";
	}
	
	public String ligar() {
		if (status==false) {
			status=true;
		}
		return "Veículo Ligado";
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherValor(float param) {
		if (param>0) {
			valor = param;
		}
	}
	
	public float retornarVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public void preencherVelocidadeMaxima (float param) {
		velocidadeMaxima = param;
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherModelo(String param ) {
		modelo = param.toUpperCase();
	}
	
	public String retornarMontadora () {
		return montadora;
	}
	
	public void preencherMontadora (String param) {
		montadora = param;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
