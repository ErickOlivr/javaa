package application;

import entities.Cliente;
import entities.ProdutoLeaf;
import entities.ProdutosComposite;
import entities.util.*;

public class Program {
	public static void main(String[] args) {
		/*

        Pix p = new Pix();

		Cliente cliente1 = new Cliente("Neymar", p);
		cliente1.comprar(150.99);
		System.out.println("\n");

		Cliente cliente2 = new Cliente("Cabrunquinho", new CartaoCredito());
		cliente1.comprar(50.99);
		System.out.println("\n");

		Cliente cliente3 = new Cliente("Cabrunquinho games",new Dinheiro());
		cliente1.comprar(97.99);
        */
        ProdutoLeaf hk = new ProdutoLeaf("Hollow night",59.99);

        ProdutoLeaf ktc = new ProdutoLeaf("Kabrunquinho Terras Comidas", 77.88);

        Cliente clarice = new Cliente("Clarice", new Pix());
        Cliente thierry = new Cliente("Thierry", new Dinheiro());
        Cliente laisla = new Cliente("Laisla", new CartaoCredito());

        ProdutoLeaf hades = new ProdutoLeaf("Hades", 73.99);
        ProdutoLeaf hades2 = new ProdutoLeaf("HadesII", 88.99);
        ProdutoLeaf sv = new ProdutoLeaf("Stardew Valley", 73.99);

        ProdutosComposite packHades = new ProdutosComposite("Pack Hades I e Hades II");

        packHades.addProdutos(hades);
        packHades.addProdutos(hades2);

        clarice.comprar(sv);
        laisla.comprar(hades);
        thierry.comprar(packHades);

	}
}
