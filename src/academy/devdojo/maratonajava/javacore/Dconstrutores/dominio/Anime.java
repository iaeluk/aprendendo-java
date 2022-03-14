package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private boolean finalizado;
    private String estudio;
    private String opiniao;

    //se eu não criar um construtor, o java cria um vazio lá no arquivo.class
    //porque o construtor é o inicializador dos objetos.
    //construtor não pode ter retorno. Nome idêntico ao da Classe, inclusive letra maiúscula.
    //a vantagem de usar um construtor é que ele me força a seguir algumas regras de preenchimento.
    //o construtor é sempre iniciado primeiro, antes de todos os métodos.
    public Anime(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    //existe também a sobrecarga de construtores, caso eu queira criar o objeto sem preencher tudo, ou preencher coisas diferentes.
    //lembrando que a sobrecarga é útil para não quebrar o código anterior.
    public Anime(boolean finalizado) {
        this.finalizado = finalizado;
    }

    //mais uma vez utilizo a sobrecarga, mas dessa vez para passar parâmetros além.
    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        //o java vai saber quem é esse this com base na quantidade e tipo de parâmetros que eu passar dentro do this.
        this(nome, tipo, episodios, genero); //obrigatoriamente o this precisa ser a primeira linha executada.
        this.estudio = estudio;
    }

    public Anime(String opiniao, boolean finalizado) {
        this(finalizado);
        this.opiniao = opiniao;
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Finalizado: " + this.finalizado);
        System.out.println("Opinião: " + this.opiniao);
        System.out.println("------------------------");
    }

    public Anime() {
        //só posso chamar o > this() < dess forma pura, dentro de construtores. Impossível chamar em outros lugares.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }
}
