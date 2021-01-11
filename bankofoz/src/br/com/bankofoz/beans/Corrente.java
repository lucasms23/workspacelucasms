package br.com.bankofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Corrente extends Conta implements PadraoConta{
	
	private float limite;
	private float taxa;
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	public Corrente() {
		super();
	}
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "]";
	}
	
	public void setCorrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		
		this.limite = limite;
		this.taxa = taxa;
	}
	@Override
	public boolean sacar(float param1) {
		if (  getSaldo()-param1 >= limite) {
		setSaldo((float) (getSaldo()-param1));
		return true;
		}
		else {
		return false;
		}
	}
	
	@Override
	public boolean depositar(float param1) {
		if (param1 > 0) {
			setSaldo(getSaldo()+param1);
			return true;
		}
		return false;
	}

	public void debitar () {
		super.setSaldo(super.getSaldo()-taxa);
	}
	
	public void aumentarLimite (float porc) {
		setLimite(getLimite()+ getLimite() * (porc/100));
	}
}
