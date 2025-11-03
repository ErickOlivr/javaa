package atividades_curso;

import java.util.Scanner;

public class Multiplos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(y%x==0) {
			System.out.println("Multiplo");
		}else {
			System.out.println("Não multiplo");
		}
		
		sc.close();
	}
	
}
