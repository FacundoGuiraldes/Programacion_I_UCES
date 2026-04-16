import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el monto total de la compra: $");
        double montoTotal = teclado.nextDouble();
        double descuento = 0;
        double montoFinal;

        // Lógica de descuentos
        if (montoTotal >= 10000) {
            descuento = 0.20; // 20% de descuento
            System.out.println("¡Categoría Oro! Aplicando 20% de descuento.");
        } else if (montoTotal >= 5000) {
            descuento = 0.10; // 10% de descuento
            System.out.println("¡Categoría Plata! Aplicando 10% de descuento.");
        } else if (montoTotal >= 2000) {
            descuento = 0.05; // 5% de descuento
            System.out.println("¡Categoría Bronce! Aplicando 5% de descuento.");
        } else {
            System.out.println("No se aplica descuento para este monto.");
        }

        // Cálculos finales
        double ahorro = montoTotal * descuento;
        montoFinal = montoTotal - ahorro;

        System.out.println("---------------------------------");
        System.out.println("Resumen de compra:");
        System.out.println("Monto original: $" + montoTotal);
        System.out.println("Ahorro aplicado: $" + ahorro);
        System.out.println("Total a pagar: $" + montoFinal);
        System.out.println("---------------------------------");

        teclado.close();
    }
}