//pacote da classe
package entities;
			//nome da classe
public class Triangle {
	//prefixo public indica que o atributo/metodo pode ser usado em outros arqs.
	//     atributo da classe
	public double a;
	public double b;
	public double c;
//         (tipo do dado)(nome do metodo)(entrada)
	public double area() {
		//(Logica)
		double p = (a + b + c) /2.0;
		
		return Math.sqrt(p*(p - a)*(p - b)*(p - c));

		
	}
}
