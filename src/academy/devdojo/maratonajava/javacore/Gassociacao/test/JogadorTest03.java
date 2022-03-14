package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Gabi");
        Time time = new Time("Brasil");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2};
        //associação bidirecional. Cada jogador tem um time e faz parte de uma lista de time.
        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprimir();

        System.out.println("--- Time ---");
        time.imprimir();

    }
}
