package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        // Uma variável de referência se torna um controle remoto para tudo aquilo que é público.
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lucas");
        pessoa.setIdade(26);
        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
