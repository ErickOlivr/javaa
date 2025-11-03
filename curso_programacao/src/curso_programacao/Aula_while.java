package curso_programacao;

import java.util.Scanner;

public class Aula_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x<5) {
			System.out.println("neymar");
			x++;
		}
		
		sc.close();
	}
}
