package trabajos0;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int valor;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            valor = sc.nextInt();
            if (valor != 0) {
                suma = suma + valor;
                contador++;
            }
        } while (valor != 0);

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
        }
        sc.close();
    }
}