package trabajos2;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        int pares = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese un número: ");
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("En el arreglo hay " + pares + " números pares.");
        sc.close();
    }
}