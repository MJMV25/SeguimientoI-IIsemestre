package Ejemplo_Break;

public class EjemploBreak {

    public static void ejemploConBreak() {
        // Ejemplo de break en un bucle for
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Sale del bucle cuando i es igual a 5
            }
            System.out.println("Valor de i (con break): " + i);
        }
        System.out.println("Bucle terminado debido al break.");
    }

    public static void ejemploConContinue() {
        // Ejemplo de continue en un bucle while
        int i = 0;
        while (i < 5) {
            i++;
            if (i == 3) {
                continue;  // Salta a la siguiente iteración cuando i es igual a 3
            }
            System.out.println("Valor de i (con continue): " + i);
        }
        System.out.println("Bucle terminado.");
    }
}
