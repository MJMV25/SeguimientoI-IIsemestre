package primitivo_boolean;

public class MainBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean resultado = Boolean.realizarOperacion(a, b);

        System.out.println("El resultado de la operación a && b es: " + resultado);
    }
}
