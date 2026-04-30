package trabajos2;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos números vas a ingresar?: ");
        int tamano = sc.nextInt();
        int[] numeros = new int[tamano];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        System.out.println("La suma de todos los elementos es: " + suma);
        sc.close();
    }
}