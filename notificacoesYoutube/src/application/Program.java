package application;
import entities.*;
public class Program {
    public static void main(String[] args){
        Canal manualdomundo = new Canal("Manual do mundo", "Ibere");
        Canal viniccius13 =  new Canal("Viniccius13","Vinicius");

        Usuario lauane = new Usuario("Lauane");
        Usuario leonardo = new Usuario("Leonardo");
        Usuario mayze = new Usuario("Mayze");
        Usuario levi = new Usuario("Levi");
        Usuario edno = new Usuario("Edno");


        lauane.inscreverSe(manualdomundo);
        leonardo.inscreverSe(viniccius13);
        leonardo.inscreverSe(manualdomundo);
        mayze.inscreverSe(viniccius13);
        levi.inscreverSe(viniccius13);
        levi.inscreverSe(manualdomundo);
        edno.inscreverSe(manualdomundo);


        manualdomundo.notificarInscritos("A BOLA PERFEITA DE OVO");
        viniccius13.notificarInscritos("Farm automática de aprovação em POO");
    }
}
