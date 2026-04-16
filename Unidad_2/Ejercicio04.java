import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número límite: ");
        int limite = teclado.nextInt();

        System.out.println("Contando hasta el " + limite + ":");

        // El bucle comienza en 1 y se ejecuta mientras i sea menor o igual al límite
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }

        teclado.close();
    }
}