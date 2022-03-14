package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    //associação unidirecial um para muitos. Cada jogador tem apenas um time, mas cada time pode ter muitos jogadores.
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
