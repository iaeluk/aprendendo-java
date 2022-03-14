package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180); //independente de ter sido criado algum objeto ou não. É da classe.

        Carro carro1 = new Carro("BMW", 280 );
        Carro carro2 = new Carro("Mercedes", 275 );
        Carro carro3 = new Carro("Audi", 290 );


        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
    }
}
