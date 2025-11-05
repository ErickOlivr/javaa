package entities;

import java.util.Random;

public class EngenheiroSenior extends Funcionario{
	Random random = new Random();
	public EngenheiroSenior(String nome, String matricula) {
		super(nome,matricula);
	}
	public void gerarSalario() {
		this.setSalario(random.nextDouble(7500.0 - 4000.0) + 4000.0);
	}
	
}
