package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("-------------");
        System.out.println(this.nome); //this faz referência ao próprio objeto.
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
