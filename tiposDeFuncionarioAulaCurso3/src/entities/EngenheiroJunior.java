package entities;
import java.util.Random;
public class EngenheiroJunior extends Funcionario{
	Random random = new Random();
	public EngenheiroJunior(String nome, String matricula) {
		super(nome,matricula);
	}
	
	public void gerarSalario() {
		this.setSalario(random.nextDouble(2500.0 - 1000.0) + 1000.0);
	}
}
