package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public void imprimir() {
        //por endereço estar no mesmo pacote de pessoa e lá os atributos serem públicos,
        //consigo acessar diretamente os atributos.
        Pessoa p = new Pessoa("Yey");
        System.out.println(p);
    }


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
