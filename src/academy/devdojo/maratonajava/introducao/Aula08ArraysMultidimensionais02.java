package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[] array1 = {1, 2};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 3, 4, 5, 6};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = array1;
        arrayInt[1] = array2;
        arrayInt[2] = array3;


        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}}; //array com base de 3 posições, já definido.


        for(int[] arrBase : arrayInt) {
            System.out.println("\n------");
            for(int num : arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
