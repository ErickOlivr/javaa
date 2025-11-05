package entities;

public class ContaBancaria {
    private String titular;
    private String numeroDaConta;
    private String agencia;
    private double saldo;

    public ContaBancaria(String titular, String numeroDaConta,String agencia){
        this.titular= titular;
        this.numeroDaConta = numeroDaConta;
        this.agencia=agencia;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositarSaldo(double valor){
        saldo +=valor;
    }

    public void sacarSaldo(double valor){
        saldo-= valor;
    }

    public String toString(){
        return String.format("Titular: %s\nNumero da conta: %s\nAgencia: %s\n",titular, numeroDaConta, agencia);
    }

}
