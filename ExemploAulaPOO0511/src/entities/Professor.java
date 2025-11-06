package entities;

public class Professor {
    private String nome;
    private  String matricula;
    private int idade;

    public Professor(String nome,int idade, String matricula){
        this.nome= nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }

    public int getIdade() {
        return idade;
    }
}
