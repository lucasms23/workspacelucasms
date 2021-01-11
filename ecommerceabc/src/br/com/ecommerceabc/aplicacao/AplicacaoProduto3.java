package br.com.ecommerceabc.aplicacao;

import javax.swing.JOptionPane;

import br.com.ecommerceabc.modelo.Produto;

public class AplicacaoProduto3 {

	public static void main(String[] args) {
		
		Produto produto = new Produto (
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descricao"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde"))
				);
		
		System.out.println(produto.getAll());
	}

}
