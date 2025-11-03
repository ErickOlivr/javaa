package atividades_curso;

import java.util.Scanner;

public class Preco_alimentos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quant  = sc.nextInt();
		double valorFinal;
		
		if(codigo == 1){
			valorFinal = quant * 4.00;
		}else if(codigo == 2){
			valorFinal = quant * 4.50;
		}else if(codigo == 3){
			valorFinal = quant * 5.00;
		}else if(codigo == 4){
			valorFinal = quant * 2.00;
		}else if(codigo == 5) {
			valorFinal = quant * 1.50;
		}else {
			valorFinal = 0;
		}
		
		System.out.printf("Total: %.2f", valorFinal);
		
		
		
		sc.close();
	}
}
