package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //static faz se tornar uma propriedade da classe e não das instâncias.
    //o modificador static faz a propriedade ser da classe Carro, independente das instâncias.
    //essa propriedade é compartilhada entre TODOS os objetos criados.
    //as boas práticas dizem que eu posso criar um método static quando ele não acessa os atrubutos da instância.
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir() {
        System.out.println("-------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite); //aqui funcionaria o this.velocidadeLimite porque é 100% de certeza de que quando eu chamar o método imprimir, haverá um objeto.
    }


    // não é possível acessar nenhuma variável não estática dentro de métodos estáticos.
    public static void setVelocidadeLimite(double velocidadeLimite) {
        //como há a possibilidade de não existir um objeto, e o atributo static pertence a classe, não é possível usar o this.
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
