package OperadoresTernarios;

public class CalculareDescuento {
    public static void main(String[] args) {
        double totalCompra = 150.0;
        double descuento = (totalCompra > 100.0) ? 20.0 : 0.0;
        double totalPagar = totalCompra - descuento;
        System.out.println("Total a pagar después del descuento: " + totalPagar);
    }
}
