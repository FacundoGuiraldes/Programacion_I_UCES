import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        // El bloque "do" se ejecuta primero, y luego se evalúa la condición
        do {
            System.out.print("Por favor, ingresa un número positivo: ");
            numero = teclado.nextInt();

            if (numero <= 0) {
                System.out.println("Error: El número ingresado no es positivo. Intentá de nuevo.");
            }

        } while (numero <= 0); // Se repite MIENTRAS el número sea menor o igual a cero

        System.out.println("¡Excelente! Ingresaste el número: " + numero);
        
        teclado.close();
    }
}