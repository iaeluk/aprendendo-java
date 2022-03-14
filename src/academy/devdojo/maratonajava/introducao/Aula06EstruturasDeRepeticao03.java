package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 números de um dado valor. Por exemplo, 50. Utilize break.

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if(i > 25) break; //break vai sair do laço de repetição quando atingir condição.
            System.out.println(i);
        }
    }
}
