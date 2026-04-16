import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = teclado.nextDouble();

        // Lógica de comparación
        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es el mayor.");
        } else if (num2 > num1) {
            System.out.println("El segundo número (" + num2 + ") es el mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        teclado.close();
    }
}