package OperadoresTernarios;

public class AñoBisiestro {
    public static void main(String[] args) {
        int anio = 2024;
        String mensaje = (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) ? "Es bisiesto" : "No es bisiesto";
        System.out.println("El año " + anio + " " + mensaje);
    }
}
