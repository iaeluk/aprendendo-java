package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rio de Janeiro");
        Aluno aluno1 = new Aluno("Lucas", 26);
        Professor professor1 = new Professor("Babidi", "Java");
        Aluno[] alunosParaSeminario = new Aluno[]{aluno1};
        Seminario seminario1 = new Seminario("Java", alunosParaSeminario, local1);
        Seminario[] seminariosDisponiveis = new Seminario[]{seminario1};
        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprimir();
    }
}
