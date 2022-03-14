package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        //se eu alterar alguma coisa em estudante, isso vai se refletir no objeto original.
        //exemplo: estudante.nome = "Lucas";
        System.out.println("---------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
