package entities;

public class Usuario implements Inscrito{
    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String notificacao) {
        System.out.println(this.getNome() + " recebeu a notificação: " + notificacao);
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void inscreverSe(Canal canal){
        canal.adicionarInscritos(this);
        System.out.println(this.getNome() + " se inscreveu no canal " + canal.getNomeDoCanal());
    }
}
