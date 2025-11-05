package application;

import entities.Pessoa;

public class Program {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Erick", 21, "000.000.000-00");

        System.out.printf("Nome: "+pessoa.getNome()+"\nIdade: "
                +pessoa.getIdade()+"\nCPF: "
                +pessoa.getCpf()+"\n");

        pessoa.aniversario();
        System.out.println("Nova idade = " + pessoa.getIdade());
    }
}
