package helloworld;

public class introducaoPoo {
	public static void main(String[] args) {
	Carro meuCarro = new Carro("Fusca");
	Carro meuCarro2 = new Carro("Sandero");
	
	
	meuCarro.acelerar();
	meuCarro2.acelerar();
	}
}

class Carro{
	//atributo
	String modelo;
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	//metodo
	public void acelerar() {
		System.out.println("acelerando o carro " + this.modelo);
	}
}
