package br.com.ecommerceabc.modelo;

public class Produto {
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	//Sintaxe dos metodos
	// <modificado> <tipo do retorno> <nome do método> (<tipo do param> <nome do param>
	
	
	
	public float getTotalVendas () {
		return (float) (qtde*valorVenda);
	}
	
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCompra="
				+ valorCompra + ", qtde=" + qtde + "]";
	}

	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}

	public float getTotalCompras () {
		return (float) (qtde*valorCompra);
	}
	
	public void atualizarValores (float porcentagem) {
		valorCompra = (float) (valorCompra*porcentagem);
		valorVenda = (float) (valorVenda*porcentagem);
	}
	
	public String verificarEstoque () {
		if (qtde > 20) {
			return "Estoque Alto";
		}else if (qtde < 5) {
			return "Estoque Baixo";
		}
		else {
			return "Estoque Normal";
		}
		
		}
	
	public float getPromocao (float porcentagem) {
		float percent=(float) (porcentagem/100);
		return (float) (valorVenda*percent);
	}
	
	
	public float getPromocao () {
		return (float) (valorVenda*0.9);
	}
	
	public String getAll () {
		return "ID: "+id+"\nDescrição: "+descricao+"Valor Venda: "+valorVenda+"Valor Compra: "+valorCompra+"qtde"+qtde;
	}
	
	public void setAll (int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	
	
}
