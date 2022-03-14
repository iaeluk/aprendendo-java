package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização estático é carregado quando a JVM carregar a classe.
    // 1 - Alocado espaço em memória para o objeto.
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
    // 3 - Bloco de inicialização é executado.
    // 4 - Construtor é executado.


     //em qualquer lugar da classe, mas geralmente colocamos no início, logo após os atributos.
    //chamamos de bloco de inicialização de instância, esse cara é executado sempre, antes mesmo, do construtor.
    // e todas as vezes que criamos uma nova instância, independente do construtor.
    // a diferença dele para um construtor, é que tudo o que eu jogar dentro dele, eu não vou precisar ficar replicando.

    //para criar um bloco de inicialização estático, que inicializa uma única vez, independente da quantidade de objetos criados, é só colocar static na frente.
    static {
        System.out.println("Dentro do bloco de inicialização estático 1.");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i+1;
        }
    }
    //se existir mais de um bloco de inicialização estático, serão executados na ordem;
    static {
        System.out.println("Dentro do bloco de inicialização estático 2.");

    }
    //não consigo acessar atributos e métodos da instância dentro do bloco de inicialização porque eles nem sequer existem.
    //pela ordem de execução, os blocos de inicialização vem primeiro.
    static {
        System.out.println("Dentro do bloco de inicialização estático 3.");

    }
    //lembrando que os blocos de inicialização não estáticos são inicializados em cada instanciação de objetos.
    {
        System.out.println("Dentro do bloco de inicialização não estático.");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
//        this.episodios = new int[100];
//        for (int i = 0; i < this.episodios.length; i++) {
//            this.episodios[i] = i+1;
//        }
        for (int episodio : Anime.episodios) {
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
