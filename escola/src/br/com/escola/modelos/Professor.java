package br.com.escola.modelos;

public class Professor {
	
	private String nome;
	private float valorHora;
	private String formacao;
	private String area;
	private String email;
	
	
	public String calcularSalario (int qtdeHoras ) {
		float salarioBruto = (float) (valorHora * 1.06) * qtdeHoras;
		float fgts = salarioBruto * (float) 0.08;
		float salarioLiquido = salarioBruto - fgts;
		return "Salario Bruto: "+salarioBruto+"\nFGTS: "+fgts+"Salário Liquido: "+salarioLiquido;
	}
	
	public String getSaudacao () {
		String primeironome = nome;
		if (nome.contains(" ")==true) {
			primeironome = nome.substring(0, nome.indexOf(" "));
		}
		if (formacao.toUpperCase().equalsIgnoreCase("DOUTOR")==true) {
			return "PhD "+primeironome;
		}else if (formacao.toUpperCase().equalsIgnoreCase("MESTRE")==true) {
			return "Ms. "+primeironome;
		}else if (formacao.toUpperCase().contentEquals("ESPECIALISTA")==true) {
			return "Especialista "+primeironome;
		}else {
			return "Sem formação: "+primeironome;
		}
		
	}
	
	public Professor(String nome, float valorHora, String formacao, String area, String email) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}

	public Professor() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Professor [nome=" + nome + ", valorHora=" + valorHora + ", formacao=" + formacao + ", area=" + area
				+ ", email=" + email + "]";
	}

	public void setProfessor(String nome, float valorHora, String formacao, String area, String email) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}
	
	
}
