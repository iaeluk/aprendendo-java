package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    //método sempre retorna algo ou não retorna nada.
    //retorno e saída são coisas diferentes.
    //void significa que o método não retorna nada. Ele faz alguma coisa, mas não retorna nada para quem o chama.
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    //quando se cria é chamado de parâmetro, quando se chama é chamado de argumento.
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if(num1 == 0 || num2 == 0) return 0;
        return num1/num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não existe divisão por 0.");
            return; // se entrar nesse if o return sai da função, como se fosse um break.
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //se eu tiver mais de um atributo o varArgs precisa ser o último porque ele não sabe onde parar, caso seja o primeiro
    //varArgs torna mais fácil a passagem se array na hora da chamada
    //mas é só uma forma mais prática e bonita.
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
 }