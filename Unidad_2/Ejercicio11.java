public class Ejercicio11 {
    public static void main(String[] args) {
        int filas = 6; // Definimos la altura del triángulo

        // Bucle externo para las filas
        for (int i = 1; i <= filas; i++) {
            
            // Bucle interno para los asteriscos de cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Salto de línea al terminar cada fila
            System.out.println();
        }
    }
}