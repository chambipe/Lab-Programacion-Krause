package trabajos2;
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}