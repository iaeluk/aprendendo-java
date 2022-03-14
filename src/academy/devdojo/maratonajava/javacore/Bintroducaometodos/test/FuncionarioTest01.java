package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        funcionario.setIdade(26);
        funcionario.setSalarios(new double[]{3500, 3534, 3487});

        funcionario.imprimir();
        funcionario.mediaSalarial();
    }
}
