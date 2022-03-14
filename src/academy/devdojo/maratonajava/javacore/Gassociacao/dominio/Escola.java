package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;
    //associação unidirecional muitos para um. Cada escola pode ter muitos professores.

    public Escola(String nome) {
        this.nome = nome;
    }
    //temos uma sobrecarga de construtor para o caso de já haver um professor a adicionar na hora da criação da escola.
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimir() {
        System.out.println("Escola: " + this.nome);
        if (professores != null) {
            System.out.print("Lista de professores: ");
            for (Professor professor : professores) {
                System.out.print(professor.getNome() + ", ");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
