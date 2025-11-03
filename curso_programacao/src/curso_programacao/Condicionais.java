package curso_programacao;

import java.util.Scanner;

public class Condicionais {
	
	public static void main(String[] args) {
		int x = 5;
		Scanner sc = new Scanner(System.in);
		if(x > 0) {
			
			System.out.println("bolsonaro presidente");
		}
		
		int hora = sc.nextInt();
		
		if(hora < 12){
			
			System.out.println("bom dia");
			
		}else if(hora < 18) {
			
			System.out.println("Boa tarde");
		}else {
				
			System.out.println("Boa noite");
				
			}
		
		sc.close();
	}
}
