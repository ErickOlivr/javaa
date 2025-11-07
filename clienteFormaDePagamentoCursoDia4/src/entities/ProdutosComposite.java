package entities;

import products.IProduto;
import java.util.List;
import java.util.ArrayList;

public class ProdutosComposite implements IProduto{
	private String nome;
	private List<IProduto> produtos;
	
	public ProdutosComposite(String nome) {
		this.nome = nome;
		this.produtos = new ArrayList<IProduto>();
	}
	public void addProdutos(IProduto produtos) {
		this.produtos.add(produtos);

	}
	@Override
	public double getPreco() {
		double r = 0;
        for(var p : produtos){
            r+=p.getPreco();
        }
        return r;
	}
	
	@Override
	public String getNome() {

		return nome;
	}
	
}
