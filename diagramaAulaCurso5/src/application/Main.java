package application;

import entities.Estado;
public class Main {
	public static void main(String[] args) {
		Estado q0 = new Estado(false);
		Estado q1 = new Estado(false);
        Estado q2 = new Estado(true);
		
		q0.setAoLerZero(q1);
		q0.setAoLerUm(q0);
		
		q1.setAoLerZero(q1);
		q1.setAoLerUm(q2);

        q2.setAoLerZero(q1);
        q2.setAoLerUm(q0);
		
		computar(q0,"0010011");
		computar(q0,"1101100");

        computar(q0,"101001");
		
		
	}
	
	public static void computar(Estado estadoInicial, String palavra) {
		Estado estadoatual = estadoInicial;
		for(char c : palavra.toCharArray()) {
			estadoatual = estadoatual.getProximoEstado(c);
		}
		boolean estadoAceita = estadoatual.isEhEstadoAceitacao();
		if(estadoAceita) {
			System.out.printf("O Automato ACEITA  a palavra: %s!!!\n",palavra);
		}
		else {
			System.out.printf("O Automato  NAO ACEITA  a palavra: %s!!!\n",palavra);
		}
		
	}
}
