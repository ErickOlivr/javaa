package atividades_curso;

import java.util.Scanner;

public class Posto_de_gasolina {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1,alcool = 0,gasolina = 0,diesel = 0;
		
		System.out.println("Informe o produto que deseja apertando: 1 - Alcool, 2 - Gasolina, 3 - diesel e 4 - Sair");
		
		while(i>0) {
			int produto = sc.nextInt();
			if(produto >= 1 && produto <= 4) {
				if(produto == 1) {
					alcool++;
				}else if(produto == 2){
					gasolina++;
				}else if(produto == 3) {
					diesel++;
				}else {
					break;
				}
			}
				
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool = " + alcool);
		System.out.println("Gasolina = " + alcool);
		System.out.println("Diesel = " + alcool);

		sc.close();
	}

}
