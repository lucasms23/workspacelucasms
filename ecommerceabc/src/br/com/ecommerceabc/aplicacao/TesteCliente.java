package br.com.ecommerceabc.aplicacao;

import br.com.ecommerceabc.modelo.Pessoa;
import br.com.ecommerceabc.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		
		Pessoa cliente = new Pessoa();
		cliente.setId(1);
		cliente.setNome("Xpto");
		cliente.setEmail("xpto@gama.com.br");
		Endereco endereco = new Endereco ();
		cliente.setEndereco(endereco);
		endereco.setLogradouro("Aenida Itaquera");
		endereco.setBairro("Itaquera");
		endereco.setCidade("São Paulo");
		endereco.setCep("12345-123");
		endereco.setComplemento("Viela 456");
		endereco.setNumero("77");
		endereco.setUf("SP");
		
		System.out.println(cliente.toString());
	}

}
