package trabajos1;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int claveCorrecta = 1234;
        int intentos = 0;
        int claveIngresada;
        boolean accesoValido = false;

        do {
            System.out.print("Ingrese la clave numérica: ");
            claveIngresada = sc.nextInt();
            intentos++;

            if (claveIngresada == claveCorrecta) {
                System.out.println("Bienvenido al Sistema");
                accesoValido = true;
                break;
            } else {
                if (intentos < 3) {
                    System.out.println("Acceso Denegado. Le quedan " + (3 - intentos) + " intentos.");
                }
            }
        } while (intentos < 3);

        if (!accesoValido) {
            System.out.println("Sistema Bloqueado");
        }

        sc.close();
    }
}