package atividades_curso;

import java.util.Scanner;

public class N_numeros_impares {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int c = 0;
		while(c<1) {
			i = sc.nextInt();
			if(i>=1 && i <=1000) {
				break;
			}else {
				System.out.println("Informe um numero entre 1 e 1000");
			}
		}
		for(int x = 0; x < i; x++) {
			if(x%2!=0) {
				System.out.println(x);
			}
		}
		sc.close();
	}
}
