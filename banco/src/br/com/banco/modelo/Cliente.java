package br.com.banco.modelo;

public class Cliente {
		private int id;
		private String nome;
		private String email;
		private Endereco endereco;

		
		
		
		public Cliente() {
			super();
		}

		public Cliente(int id, String nome, String email, Endereco endereco) {
			super();
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.endereco = endereco;
		}

		public void setCliente(int id, String nome, String email, Endereco endereco) {
			
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.endereco = endereco;
		}

		public String toString() {
			return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + "]";
		}
		
				
		public int getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public void setId(int id) {
			this.id = id;
		}

}
