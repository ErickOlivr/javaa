package entities;
public abstract class  Funcionario {
	private String nome;
	private String matricula;
	private String funcao;
	private double salario;
	
	public Funcionario(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.funcao = "";
		this.salario = 0.0;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract void gerarSalario();
	
	public String ToString() {
		return String.format("Nome: %s\nMatricula: %s\nFuncao:%s\nSalario: %.2f", nome,matricula,funcao,salario);
	}
	
}
