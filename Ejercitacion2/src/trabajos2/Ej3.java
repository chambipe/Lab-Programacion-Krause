package trabajos2;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Ingrese un número: ");
            lista[i] = sc.nextInt();
        }

        int minimo = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] < minimo) {
                minimo = lista[i];
            }
        }

        System.out.println("El número más chico es: " + minimo);
        sc.close();
    }
}