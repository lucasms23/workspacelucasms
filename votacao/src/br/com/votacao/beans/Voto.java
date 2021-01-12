package br.com.votacao.beans;

public class Voto {
	
	private boolean primeiroTurno;
	Pessoa eleitor = new Pessoa();
	Pessoa candidato = new Pessoa();
	
	
	public boolean isPrimeiroTurno() {
		return primeiroTurno;
	}
	public void setPrimeiroTurno(boolean primeiroTurno) {
		this.primeiroTurno = primeiroTurno;
	}
	public Pessoa getEleitor() {
		return eleitor;
	}
	public void setEleitor(Pessoa eleitor) {
		this.eleitor = eleitor;
	}
	public Pessoa getCandidato() {
		return candidato;
	}
	public void setCandidato(Pessoa candidato) {
		this.candidato = candidato;
	}
	public Voto(boolean primeiroTurno, Pessoa eleitor, Pessoa candidato) {
		super();
		this.primeiroTurno = primeiroTurno;
		this.eleitor = eleitor;
		this.candidato = candidato;
	}
	public Voto() {
		super();
	}
	@Override
	public String toString() {
		return "Voto [primeiroTurno=" + primeiroTurno + ", eleitor=" + eleitor + ", candidato=" + candidato + "]";
	}
	public void setAll(boolean primeiroTurno, Pessoa eleitor, Pessoa candidato) {
		
		this.primeiroTurno = primeiroTurno;
		this.eleitor = eleitor;
		this.candidato = candidato;
	}
	
	

}
