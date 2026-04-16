import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el dividendo (primer número): ");
        int num1 = teclado.nextInt();

        System.out.print("Ingresa el divisor (segundo número): ");
        int num2 = teclado.nextInt();

        // Verificamos que el divisor no sea cero
        if (num2 != 0) {
            int cociente = num1 / num2; // Resultado entero
            int resto = num1 % num2;    // Resto de la división

            System.out.println("---------------------------------");
            System.out.println("Resultado de la división entera: " + cociente);
            System.out.println("Resto de la división: " + resto);
            System.out.println("Prueba: " + num1 + " = (" + num2 + " * " + cociente + ") + " + resto);
            System.out.println("---------------------------------");
        } else {
            System.out.println("Error: No es posible dividir por cero. Por favor, reinicia el programa.");
        }

        teclado.close();
    }
}