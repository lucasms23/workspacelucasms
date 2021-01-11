package br.com.bankofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Conta implements PadraoConta{
	
	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	
	Cliente cliente = new Cliente();
	
	public float verificarSaldo () {
		return saldo;
	}
	
	public short getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public byte getDigito() {
		return digito;
	}

	public void setDigito(byte digito) {
		this.digito = digito;
	}

	public short getAgencia() {
		return agencia;
	}

	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Conta() {
		super();
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}

	public void setConta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	@Override
	public boolean sacar(float param1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositar(float param1) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
