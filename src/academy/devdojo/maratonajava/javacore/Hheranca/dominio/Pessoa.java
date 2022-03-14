package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

//curiosidade: todas as classes no java fazem um extends Object
public class Pessoa {
    //existe um modificador de acesso que permite qualquer subclasse em qualquer pacote a ter acesso direto a qualquer atributo, como se estivesse na sua própria classe.
    //esse modificador de acesso é o protected.
    //ele dá acesso direto a todas as subclasses, onde quer que elas estejam.
    //porém, todas as classes do mesmo pacote também conseguem ter acessp.
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Pessoa 2");
    }

    //os construtores da classe mãe precisam ser chamados nas classes filhas.
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa.");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
