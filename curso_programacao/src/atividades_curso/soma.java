package atividades_curso;

import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
		int x, y, result;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		result = x + y;
		
		System.out.println("Soma: = " + result);
		
	}
}
