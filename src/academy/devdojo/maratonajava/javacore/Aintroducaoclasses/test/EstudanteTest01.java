package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // eu tenho uma variável de referência do tipo Estudante
        Estudante estudante = new Estudante(); // o new objeto tbm é do tipo Estudante
        estudante.nome = "Lucas";
        estudante.idade = 26;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante); //tenho o endereço de memória pq é uma variável de reference. Faz referência a um objeto.
    }
}
