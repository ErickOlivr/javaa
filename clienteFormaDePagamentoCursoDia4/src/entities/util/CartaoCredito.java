package entities.util;

public class CartaoCredito implements MetodoDePagamento{
	@Override
	public void pagar(double valor) {
		System.out.printf("\nPagamento de R$%.2f realizado via Cartão de credito\n", valor);
	}

}
