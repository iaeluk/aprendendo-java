package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * retornam valores aritméticos
        int numero1 = 10;
        double numero2 = 20; // O resultado de dois números inteiros é um número inteiro. E possível fazer um casting (forçar), mas é meio feio fazer isso.
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // % resto da divisão é útil para saber se um número é par ou ímpar.
        int resto = 21 % 2;
        System.out.println(resto);

        //operadores relacionais retornam booleanos
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        boolean isDezIgualDez = 10 == 10;
        System.out.println("isDezIgualDez " + isDezIgualDez);
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        //operadores lógicos. Sempre retornam booleanos. Temos 3 tipos. AND ( && ), OR ( || ), NOT ( ! )
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentrodaLeiMenorQueTrinta " + isDentrodaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel " + isPlayStationCincoCompravel);

        //operadores de atribuição. = += -= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //operadores de incrementação. ++ --
        int contador = 0;
        contador += 1;
        contador++; //primeiro mostra e depois atribui
        ++contador; // já atribui antes de mostrar
        --contador;
        System.out.println(contador);
    }
}
