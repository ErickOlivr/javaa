package atividades_curso;

import java.util.Scanner;

public class area_circulo {
	public static void main(String[] args) {
		
		float raio;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio da circunferencia desejada: ");
		raio = sc.nextFloat();
		
		area = 3.14 * (raio*raio);
		
		System.out.printf("A area é de: %.4f", area);
		
		sc.close();
	}
}
