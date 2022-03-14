package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // condição é que valor da parcela tem que ser maior ou igual a 1000.

        double valorTotalDoCarro = 70000;

        for (int parcela = 1; parcela < valorTotalDoCarro; parcela++) {
            double valorParcela = valorTotalDoCarro / parcela;
            if(valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
        }

        // ou

        for (int parcela = 1; parcela < valorTotalDoCarro; parcela++) {
            double valorParcela = valorTotalDoCarro / parcela;
            if(valorParcela < 1000) break;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }
}
