package helloworld;
import java.util.ArrayList;

public class anotacoes {
	public static void main(String[] args) {
		//variaveis primitivas
		
		//bytes(8 bits) aceita valores entre -128 a 127
		byte minhaVar = 57;
		//short(16 bits) aceita valores entre -32.768 a 32.767
		short meushort = 29999;
		//int(32 bits)
		int numero = 20;
		//long(64bits)
		long numeroGrande = 2000000000;
		
		//float(32bits)
		//float decimal = 0.98;
		//double(64bits) tem maior precisao
		double decimal2 = 23.40596;
		
		//string representa paravras e frases
		String palavra = "paralelepipedo";
		//chat aprenas um unico caractere
		char letra = 'a';
		//True ou false
		boolean vouf= false;
		
		
		//testes de condicionais
		
		if(vouf == true) {
			System.out.println("verdade");
		}else {
			System.out.println("Falso");
		}
		
		//colecoes de dados
		//os colchetes sinalizam que é um array, e o tamanho do array deve ser sinalizado sempre
		
		int[] lista = {1,2,3,4,5};
		//nesse caso, é um array sem nenhum valor, porem com o tamanho ja predefinido(20 elementos)
		int[] lista2 = new int[20];
		
		//ArrayList = tipo de array com dados manipulaveis === necessita do java.util
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Neymar");
		nomes.add("Ana Julia");
		
		System.out.println(nomes.get(0));
		
		//loops
		
		//for
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		//while
		int cont = 1;
		while(cont <= 10){
			System.out.println(cont);
			cont++;
		}
		
		//casting
		double resultado = 0.0;
		int resultadoInt = (int) resultado;
		
		String numeroString = "10";
		int numeroInt = Integer.parseInt(numeroString);
		
		
	}
}