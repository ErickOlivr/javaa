package entities;
import java.util.Random;

public class EngenheiroPleno extends Funcionario {
	Random random = new Random();
	public EngenheiroPleno(String nome, String matricula) {
		super(nome, matricula);
	}
	public void gerarSalario() {
		this.setSalario(random.nextDouble(4500.0 - 2000.0) + 2000.0);
	}
}
