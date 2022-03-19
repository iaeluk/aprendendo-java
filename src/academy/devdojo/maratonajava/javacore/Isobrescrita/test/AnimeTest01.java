package academy.devdojo.maratonajava.javacore.Isobrescrita.test;

import academy.devdojo.maratonajava.javacore.Isobrescrita.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z");
        //toda vez que eu colocar uma variável de referência dentro de um sout, o java vai chamar o método toString().
        System.out.println(anime);

    }
}
