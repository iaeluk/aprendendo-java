package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //quando se cria é chamado de parâmetro, quando se chama é chamado de argumento.
        calculadora.multiplicaDoisNumeros(10, 20);
    }
}
