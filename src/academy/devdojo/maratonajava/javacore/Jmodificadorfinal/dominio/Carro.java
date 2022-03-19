package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro { //uma classe com o modificador final não pode ser estendida.
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //tenho que ter ela inicializada de alguma forma antes de usar.
    //no java, utilizamos a palavra final para definir uma constante.
    //convenção própria de escrita. Tudo em uppercase e _ para separar múltiplas palavras. VOCE_ENTENDEU ?
    public final Comprador COMPRADOR = new Comprador(); //a referência para esse objeto nunca poderá ser alterada.
    //esse objeto final nunca poderá ser alterado, porém, os dados do objeto podem ser alterados.

    public final void imprime() { // final impede que possa ser sobrecarregado.
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
