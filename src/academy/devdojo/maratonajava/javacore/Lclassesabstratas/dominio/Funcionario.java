package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

//quando eu coloco uma classe como abstrata, eu estou criando um template que apenas as classes que a estendem poderão utilizar
//não posso dar new em uma classe abstrata.
//não posso ter uma instância de Funcionario.
//uma classe abstrata é uma classe que foi criada para ser estendida. Foi criada para ser uma superclasse.
//não posso usar final e abstract porque eles têm sentidos opostos.
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    //método abstrato que obrigatoriamente precisa ser implementado nas subclasses.
    //nunca vou poder ter abstract em uma classe concreta.
    //mas posso ter métodos concretos em classes abstratas.
    public abstract void calculaBonus();

}
