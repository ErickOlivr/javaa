package entities;

import products.IProduto;
public class ProdutoLeaf implements IProduto{
	private String nomeProduto;
	private double preco;
	
	public ProdutoLeaf(String nome,double preco) {
		this.nomeProduto = nome;
		this.preco = preco;
	}


	public double getPreco() {

		return preco;
	}

	public String getNome() {
		return nomeProduto;
	}
	
	
	
}
