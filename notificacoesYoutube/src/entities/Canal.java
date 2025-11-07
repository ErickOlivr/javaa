package entities;

import java.util.List;
import java.util.ArrayList;
public class Canal {
    String nomeDoCanal;
    String nomeDoYoutuber;
    List<Inscrito> inscritos = new ArrayList<Inscrito>();

    public Canal(String nomeDoCanal, String nomeDoYoutuber){
        this.nomeDoCanal = nomeDoCanal;
        this.nomeDoYoutuber = nomeDoYoutuber;
    }

    public String getNomeDoCanal(){
        return nomeDoCanal;
    }

    public void adicionarInscritos(Inscrito novoInscrito){
        inscritos.add(novoInscrito);
    }

    public void notificarInscritos(String nomeDoVideo) {
        System.out.println(this.nomeDoYoutuber + " do canal " + this.nomeDoCanal + " publicou um novo video: " + nomeDoVideo);
        for(Inscrito inscrito : this.inscritos){
            inscrito.receberNotificacao(nomeDoVideo);
        }
    }
}
