package entities;

public class Circulo {
    protected double raio;
    static double PI = 3.14;
    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double area(){
        return PI*(raio*raio);
    }
}
