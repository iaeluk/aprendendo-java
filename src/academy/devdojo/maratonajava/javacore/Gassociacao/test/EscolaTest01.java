package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Rodrigo");
        Professor professor2 = new Professor("Ricardo");
        Professor professor3 = new Professor("Rômulo");
        Professor[] professores = new Professor[]{professor1, professor2, professor3};
        Escola escola = new Escola("Konaha", professores);

        escola.imprimir();
    }
}
