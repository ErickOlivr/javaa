package atividades_curso;

import java.util.Scanner;

public class negativo_or_not {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("NÃO NEGATIVO");	
		}else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}
}
