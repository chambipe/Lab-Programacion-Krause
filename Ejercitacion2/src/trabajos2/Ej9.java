package trabajos2;
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] secuencia = {3, 1, 4, 2, 5}; // La secuencia a memorizar
        boolean perdio = false;

        System.out.println("Juego Simón Dice. Memoriza la secuencia y repítela.");

        for (int i = 0; i < secuencia.length; i++) {
            System.out.print("Introduce el número en la posición " + i + ": ");
            int entrada = sc.nextInt();

            if (entrada != secuencia[i]) {
                perdio = true;
                break;
            }
        }

        if (perdio) {
            System.out.println("¡Incorrecto! Perdiste el juego.");
        } else {
            System.out.println("¡Felicidades! Completaste la secuencia correctamente.");
        }
        sc.close();
    }
}