package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //todos os atributos em interfaces são constantes
    public static final int MAX_DATA_SIZE = 10;

    //em interfaces, todos os métodos são public abstract por padrão
    public abstract void load();

    //quando o método é default é preciso te uma implementação
    public default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
