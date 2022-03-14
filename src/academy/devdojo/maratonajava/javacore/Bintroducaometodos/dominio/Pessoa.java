package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    //para garantir um baixo acoplamento, utilizamos modificadores de acesso privados.
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome); //dentro do próprio objeto é melhor usar o this para saber os valores. É mais bonito.
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida.");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
