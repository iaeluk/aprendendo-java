package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    //o nome precisa ser o mesmo
    //a quantidade ou ausência de parâmetros tem que ser igual.
    @Override //para ter certeza de que estou sobrescrevendo e não criando um outro, ou digitando errado.
    public String toString() { //sobrescrevendo o método toString()
        return "Anime: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
