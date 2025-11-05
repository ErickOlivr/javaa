package application;

import entities.ContaBancaria;

public class Program {
    public static void main(String[] args){
        ContaBancaria contaBancaria = new ContaBancaria("Neymar","394034", "220-00");

        contaBancaria.depositarSaldo(100.0);
        contaBancaria.sacarSaldo(20.0);
        System.out.println("Saldo atual:"+contaBancaria.getSaldo());
        System.out.println(contaBancaria);
    }
}
