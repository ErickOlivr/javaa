package atividades_curso;

import java.util.Scanner;

public class Horas_jogadas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comeco = sc.nextInt();
		int finaly = sc.nextInt();
		
		int duracao;
		if(comeco<finaly) {
			duracao = finaly - comeco;
		}else {
			duracao = 24 - comeco + finaly;
		}
		System.out.println("Durou " + duracao + " horas");
		
		
		sc.close();
	}
}
