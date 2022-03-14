package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // temos 8 tipos primitivos, todos em letra minúscula.
        //int, double, float, char, byte, short, long, boolean
        int idade = 26;
        long numeroGrande = 10000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 26;
        short idadeShort = 26;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'L';
        String nome = "Lucas"; //String não é um tipo primitivo. Usa-se aspas duplas ""

        System.out.println("A idade é " + idade + " anos.");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);

        System.out.println("Oi, meu nome é " + nome);

    }
}
