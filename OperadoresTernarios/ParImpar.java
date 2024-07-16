package OperadoresTernarios;

public class ParImpar {
    public static void main(String[] args) {
        int numero = 7;
        String mensaje = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("El número " + numero + " " + mensaje);
    }
}
