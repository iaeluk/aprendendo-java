package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("YuYu Hakusho", "TV", 112, "Ação");
        anime1.setOpiniao("Excelente");
        Anime anime2 = new Anime(true);
        Anime anime3 = new Anime("Dragon Ball", "TV", 985, "Ação", "Japão");
        Anime anime4 = new Anime("Ótimo", true);
        anime1.imprimir();
        anime2.imprimir();
        anime3.imprimir();
        anime4.imprimir();
    }
}
