package atividades_curso;

import java.util.Scanner;

public class Senha_valida {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while(i>0) {
			int x = sc.nextInt();
			if(x == 2002) {
				System.out.println("Senha válida");
				break;
			}else {
				System.out.println("Senha invalida");
			}
		}
		sc.close();
	}
}
