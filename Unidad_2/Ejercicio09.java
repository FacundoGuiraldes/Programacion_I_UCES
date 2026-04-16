import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el número inicial del rango: ");
        int inicio = teclado.nextInt();

        System.out.print("Ingresa el número final del rango: ");
        int fin = teclado.nextInt();

        System.out.println("Números primos entre " + inicio + " y " + fin + ":");

        // Bucle externo: recorre el rango
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(); // Salto de línea final
        teclado.close();
    }

    // Método auxiliar para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // 0, 1 y negativos no son primos
        }
        
        // Verificamos divisores desde 2 hasta la raíz cuadrada del número (optimización)
        for (int j = 2; j <= Math.sqrt(numero); j++) {
            if (numero % j == 0) {
                return false; // Si tiene un divisor, no es primo
            }
        }
        return true; // Si no encontró divisores, es primo
    }
}