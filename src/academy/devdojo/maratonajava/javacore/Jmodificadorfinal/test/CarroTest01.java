package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("Velocidade Limite: " + Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Yusuke");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Boom");
        ferrari.imprime();
    }
}
