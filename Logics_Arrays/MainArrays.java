package Logics_Arrays;

public class MainArrays {
    public static void main(String[] args) {
        int tamañoArray = 5;
        int[] miArray = Arrays.crearArray(tamañoArray);

        System.out.print("Contenido del array: ");
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i] + " ");
        }
        System.out.println();
    }
}
