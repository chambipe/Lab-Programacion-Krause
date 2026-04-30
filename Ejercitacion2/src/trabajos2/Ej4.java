package trabajos2;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[4];
        int sumaTotal = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor: ");
            valores[i] = sc.nextInt();
            sumaTotal += valores[i];
        }

        double promedio = (double) sumaTotal / valores.length;
        System.out.println("El promedio de los elementos es: " + promedio);
        sc.close();
    }
}