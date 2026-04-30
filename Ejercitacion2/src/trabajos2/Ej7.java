package trabajos2;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = {10, 25, 3, 47, 8, 12, 50, 4, 1, 9};
        boolean encontrado = false;

        System.out.print("¿Qué número buscás en la lista?: ");
        int buscado = sc.nextInt();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == buscado) {
                encontrado = true;
                System.out.println("Número encontrado en la posición: " + i);
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("El número no está en el arreglo.");
        }
        sc.close();
    }
}