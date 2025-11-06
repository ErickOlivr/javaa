package entities;

public class ProfessorIntegral extends Professor{
    private double salario;

    public ProfessorIntegral(String nome, int idade, String matricula, double Salario){
        super(nome,idade,matricula);
    }
    public double getSalario(){
        return salario;
    }
}
