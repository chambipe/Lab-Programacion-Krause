package trabajos2;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] datos = new int[5]; // Lo hacemos de 5 para probar rápido
        
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Cargue un número: ");
            datos[i] = sc.nextInt();
        }

        int maximo = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > maximo) {
                maximo = datos[i];
            }
        }

        System.out.println("El número más grande es: " + maximo);
        sc.close();
    }
}