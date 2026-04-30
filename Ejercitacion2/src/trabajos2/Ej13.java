package trabajos2;
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[4];
        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Nota final de " + nombres[i] + ": ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("\nResultados finales:");
        for (int i = 0; i < 4; i++) {
            if (notas[i] >= 6) {
                System.out.println(nombres[i] + ": Aprobado");
            } else {
                System.out.println(nombres[i] + ": Reprobado");
            }
        }
        sc.close();
    }
}