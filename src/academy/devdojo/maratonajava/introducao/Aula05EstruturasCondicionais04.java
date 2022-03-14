package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        String mensagem;

        if (salarioAnual < 34713) {
            mensagem = "É preciso pagar 9.70% de imposto. O valor do seu imposto é de: " + salarioAnual * 9.70 / 100;
        } else if(salarioAnual >= 34713 && salarioAnual < 68508) {
            mensagem = "É preciso pagar 37.35% de imposto. O valor do seu imposto é de: " + salarioAnual * 37.35 / 100;
        } else {
            mensagem = "É preciso pagar 49.50% de imposto. O valor do seu imposto é de: " + salarioAnual * 49.50 / 100;

        }
        System.out.println(mensagem);
    }
}
