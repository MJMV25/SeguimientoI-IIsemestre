package OperadoresTernarios;

public class MayorDeEdad {
    public static void main(String[] args) {
        int edad = 19;
        String mensaje = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println("La persona con edad " + edad + " " + mensaje);
    }
}
