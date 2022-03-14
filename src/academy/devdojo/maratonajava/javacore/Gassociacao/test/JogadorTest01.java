package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Arrascaeta");
        Jogador jogador3 = new Jogador("Cristiano Ronaldo");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3}; //cada posição de um array guarda uma referência para um objeto.

        for (Jogador jogador : jogadores) {
            jogador.imprimir();
        }

    }
}
