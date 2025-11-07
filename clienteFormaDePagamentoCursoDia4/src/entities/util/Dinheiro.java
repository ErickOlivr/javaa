package entities.util;

public class Dinheiro implements MetodoDePagamento{
	@Override
	public void pagar(double valor) {
		System.out.printf("\nPagamento de R$%.2f realizado via Dinheiro\n", valor);
		
	}

}
