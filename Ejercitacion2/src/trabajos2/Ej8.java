package trabajos2;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] datos = {5, 2, 5, 8, 5, 1, 9, 5}; // Array con varios repetidos
        int contador = 0;

        System.out.print("Ingrese el número para contar sus repeticiones: ");
        int objetivo = sc.nextInt();

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == objetivo) {
                contador++;
            }
        }

        System.out.println("El número " + objetivo + " aparece " + contador + " veces.");
        sc.close();
    }
}