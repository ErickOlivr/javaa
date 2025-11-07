package entities;

import entities.util.MetodoDePagamento;
import products.IProduto;

public class Cliente{
	private String nomeCliente;
	private MetodoDePagamento carteira;
	
	public Cliente(String nome, MetodoDePagamento carteira) {
		this.nomeCliente = nome;
		this.carteira = carteira;
	}
	
	public void comprar(IProduto produto) {
		System.out.printf("[%s] está realizando um pagamento…",nomeCliente);
		carteira.pagar(produto.getPreco());
        System.out.printf("%s comprou %s\n\n",nomeCliente,produto.getNome());
	}
	
	public String getNome() {
		return nomeCliente;
	}
}
