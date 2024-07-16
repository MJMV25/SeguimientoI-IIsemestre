package primitivo_Int;

public class MainSuma {
    public static void main(String[] args) {
        Suma suma = new Suma();
        int resultado = suma.sumar();
        System.out.println("La suma de " + suma.numero1 + " y " + suma.numero2 + " es: " + resultado);
}
    }