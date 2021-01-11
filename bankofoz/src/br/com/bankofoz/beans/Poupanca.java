package br.com.bankofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Poupanca extends Conta implements PadraoConta {
	
	private float rendimento;

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "]";
	}

	public void setPoupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		
		this.rendimento = rendimento;
	}

	@Override
	public boolean sacar(float param1) {
		if (getSaldo()>0 && getSaldo() <= param1) {
			setSaldo((float) (getSaldo()-param1));
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean depositar(float param1) {
		if (param1 > 0) {
			setSaldo(getSaldo()+param1);
		}
		return false;
	}

	public void creditarRendimentos () {
		setSaldo(getSaldo()+(rendimento/100));
	}
	
	
}