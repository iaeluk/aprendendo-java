package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Mitsubishi";
        carro1.modelo = "XL";
        carro1.ano = 2022;

        //carro1 = carro2; //nesse caso, o carro1 faz referência para o mesmo objeto que o carro2 está fazendo;
        //nesse caso, eu perdi a referência do objeto a quem o carro1 fazia referência. Não é possível mais recuperar, a menos que ele estivesse sendo referenciado em uma terceira variável.
        // é cecessário ser do mesmo tipo

        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        System.out.println("Carro 1: " + carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
