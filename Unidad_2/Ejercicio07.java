import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrasena;
        int longitudMinima = 8;

        do {
            System.out.print("Crea una contraseña (mínimo " + longitudMinima + " caracteres): ");
            contrasena = teclado.nextLine();

            if (contrasena.length() < longitudMinima) {
                System.out.println("Error: La contraseña es muy corta. Faltan " 
                                    + (longitudMinima - contrasena.length()) + " caracteres.");
            }

        } while (contrasena.length() < longitudMinima);

        System.out.println("Contraseña aceptada y guardada correctamente.");
        
        teclado.close();
    }
}