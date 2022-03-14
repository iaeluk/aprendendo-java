package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02b {
    public static void main(String[] args) {

        String[] nomes = new String[4]; //o tamanho do array não pode ser mudado dinamicamente.
        nomes[0] = "Chaves";
        nomes[1] = "Chapolin";
        nomes[2] = "Chespirito";
        nomes[3] = "Seu Madruga";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
