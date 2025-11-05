package entities;
import java.util.Random;

public class AssistenteAdm extends Funcionario{
	Random random = new Random();
	public AssistenteAdm(String nome, String matricula) {
		super(nome,matricula);
	}

	public void gerarSalario() {
		
		this.setSalario(random.nextDouble(1500.0 - 500.0) + 500.0);
		}
	
}
