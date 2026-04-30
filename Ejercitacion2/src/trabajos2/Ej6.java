package trabajos2;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = (int)(Math.random() * 100) + 1;
        int intento;

        System.out.println("He pensado un número entre 1 y 100. ¡Trata de adivinarlo!");

        do {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();

            if (intento < secreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > secreto) {
                System.out.println("El número secreto es menor.");
            }
        } while (intento != secreto);

        System.out.println("¡Exacto! El número era " + secreto);
        sc.close();
    }
}