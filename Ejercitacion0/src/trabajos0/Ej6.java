package trabajos0;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        int cantidad = 0;

        while (acumulador < 20) {
            System.out.print("Ingrese un número: ");
            int n = sc.nextInt();
            acumulador = acumulador + n;
            cantidad++;
        }

        double promedioFinal = (double) acumulador / cantidad;
        System.out.println("Suma total: " + acumulador);
        System.out.println("El promedio de los ingresos es: " + promedioFinal);
        sc.close();
    }
}