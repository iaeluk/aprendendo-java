package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-282");
        Pessoa pessoa = new Pessoa("Lucas");
        pessoa.setCpf("000000000-11");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        System.out.println("------------------");

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("000000000-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprimir();

        System.out.println("--------------------");
        funcionario.relatorioPagamento();
    }
}
