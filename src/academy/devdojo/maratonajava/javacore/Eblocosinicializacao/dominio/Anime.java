package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória para o objeto.
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
    // 3 - Bloco de inicialização é executado.
    // 4 - Construtor é executado.


     //em qualquer lugar da classe, mas geralmente colocamos no início, logo após os atributos.
    //chamamos de bloco de inicialização de instância, esse cara é executado sempre, antes mesmo, do construtor.
    // e todas as vezes que criamos uma nova instância, independente do construtor.
    // a diferença dele para um construtor, é que tudo o que eu jogar dentro dele, eu não vou precisar ficar replicando.
    {
        System.out.println("Dentro do bloco de inicialização");
        this.episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
//        this.episodios = new int[100];
//        for (int i = 0; i < this.episodios.length; i++) {
//            this.episodios[i] = i+1;
//        }

        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
