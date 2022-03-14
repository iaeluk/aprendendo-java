package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02a {
    public static void main(String[] args) {
        // valores padrão de inicialização
        // byte, short, int, long, float e double o padrão é 0 || só é possível utilizar new em tipo primitivo
        // quando se está trabalhando com array
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] tipos = new String[3];
        System.out.println(tipos[0]);
        System.out.println(tipos[1]);
        System.out.println(tipos[2]);
    }
}
