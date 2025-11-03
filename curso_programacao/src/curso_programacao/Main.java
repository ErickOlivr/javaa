package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("hello world");
		Scanner sc =  new Scanner(System.in);
		double x, result;
		x = sc.nextDouble();
		
		System.out.println(x);
		sc.close();
	}

}
