package Logics_Arrays;

public class Arrays {
    public static int[] crearArray(int tamaño) {

        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = i + 1;
        }

        return array;
    }
}
