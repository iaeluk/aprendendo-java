package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //isso é uma variável do tipo reference.
        int[] idades = new int[3]; // eu tenho que dizer o comprimento do array.
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;


        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
