package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.salarios == null) return;

        for (int i = 0; i < this.salarios.length; i++) {
            System.out.println("Salário " + (i+1) + " é de: " + this.salarios[i]);
        }
    }

    public void mediaSalarial() {
        if (this.salarios == null) return;

        for (double salario : this.salarios) {
            this.media += salario;
        }
        this.media /= this.salarios.length;
        System.out.println("---------------------------");
        System.out.println("Média Salarial é de: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
