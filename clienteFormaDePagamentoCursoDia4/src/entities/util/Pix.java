package entities.util;

public class Pix implements MetodoDePagamento{
	@Override
	public void pagar(double valor) {
		System.out.printf("\nPagamento de R$%.2f realizado via PIX\n", valor);
	}

}
