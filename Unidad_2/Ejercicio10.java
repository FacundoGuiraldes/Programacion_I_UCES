import java.util.Scanner;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        // Generamos un número secreto entre 1 y 100
        int numeroSecreto = aleatorio.nextInt(100) + 1;
        int intentoUsuario = 0;
        int intentosRealizados = 0;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He pensado un número entre 1 y 100. ¡Intentá adivinarlo!");

        // El bucle sigue mientras el usuario no acierte
        while (intentoUsuario != numeroSecreto) {
            System.out.print("Ingresá tu número: ");
            intentoUsuario = teclado.nextInt();
            intentosRealizados++;

            if (intentoUsuario < numeroSecreto) {
                System.out.println("Pista: El número secreto es MAYOR.");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("Pista: El número secreto es MENOR.");
            } else {
                System.out.println("¡EXCELENTE! Adivinaste el número en " + intentosRealizados + " intentos.");
            }
        }

        teclado.close();
    }
}