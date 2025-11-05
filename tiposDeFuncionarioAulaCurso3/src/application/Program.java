package application;
import entities.*;

public class Program {
	public static void main(String[] args) {
		Funcionario funcionario1 = new AssistenteAdm("neymar", "001-1");
		funcionario1.setFuncao("bbbb");
		funcionario1.gerarSalario();
		System.out.println(funcionario1.ToString());
		
		System.out.println("");
		
		Funcionario funcionario2 = new EngenheiroJunior("marcos", "002-1");
		funcionario2.setFuncao("aaaa");
		funcionario2.gerarSalario();
		System.out.println(funcionario2.ToString());
		
		System.out.println("");
		
		Funcionario funcionario3 = new EngenheiroPleno("cleber", "272-1");
		funcionario3.setFuncao("dddd");
		funcionario3.gerarSalario();
		System.out.println(funcionario3.ToString());
		
		System.out.println("");
		
		Funcionario funcionario4 = new EngenheiroSenior("morte", "332-1");
		funcionario4.setFuncao("cccc");
		funcionario4.gerarSalario();
		System.out.println(funcionario4.ToString());
		
		
	}
}
