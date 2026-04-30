package trabajos1;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos alumnos desea calificar?: ");
        int cantidadAlumnos = sc.nextInt();
        int sumaNotas = 0;

        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + i + " (1-10): ");
            int nota = sc.nextInt();
            sumaNotas = sumaNotas + nota;

            if (nota >= 1 && nota <= 3) {
                System.out.println("Clasificación: Insuficiente");
            } else if (nota >= 4 && nota <= 5) {
                System.out.println("Clasificación: Regular");
            } else if (nota >= 6 && nota <= 7) {
                System.out.println("Clasificación: Bueno");
            } else if (nota >= 8 && nota <= 9) {
                System.out.println("Clasificación: Muy Bueno");
            } else if (nota == 10) {
                System.out.println("Clasificación: Excelente");
            }
        }

        if (cantidadAlumnos > 0) {
            double promedio = (double) sumaNotas / cantidadAlumnos;
            System.out.println("El promedio general del curso es: " + promedio);
        }

        sc.close();
    }
}