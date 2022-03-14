package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario  extends Pessoa{
    //na associação falamos de HAS A (tem um).
    //na herança falamos de IS A (é um).
    //na herança eu acoplo muito fortemente o meu código.
    //usa-se extends + a classe genérica que eu desejo extender. Não existe herança múltipla. Só posso extender uma única classe.
    //eu uso herança quando eu quero extender a funcionalidade de uma classe e manter um relacionamento entre elas.
    //é preciso utilizar herança com cautela, pois qualquer alteração que se faz na classe mais genérica, é preciso se preocupar com as classes estendidas.
    //herança é a extensão das funcionalidades de alguma coisa que é mais genérica.
    //quanto mais para baixo se vai, mais específico, quanto mais pra cima de vai, mais genérico.
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionario 2");
    }


    //nas subclasses é preciso criar um construtor que atenda aos requisitos da superclasse.
    public Funcionario(String nome) {
        //uma chamada com super() sem argumentos não é necessária, pois isso já é uma chamada implícita.
        super(nome); //recebo o nome e repasso para o construtor da classe mãe. Super tem sempre que ser o primeira linha executável.
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprimir() {
        //toda vez que eu uso super eu estou me referindo a classe mais genérico.
        //aplicando a cada objeto que o chama.
        super.imprimir();
        System.out.println(this.nome);
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu, " + this.nome + ", recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
