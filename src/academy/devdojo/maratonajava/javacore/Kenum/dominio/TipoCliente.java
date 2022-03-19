package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    //enumeração é um tipo especial de classe.
    //limita opções.
    //usado quando eu quero que atributos sejam constantes.
    //quando eu tenho uma quantidade limite de opções e quero forçar o preenchimento somente com elas.

    //esses valores são do tipo TipoCliente
    //posso passar atributos e criar um construtor
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    //esse construtor é privado. Eu nunca vou conseguir chamar ele. Quem o chama é a enumeração.
    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
               return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
