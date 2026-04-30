package trabajos1;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPositivos = 0;
        int cantidadNegativos = 0;
        int numero;

        System.out.println("Ingrese números enteros (0 para terminar):");
        
        do {
            numero = sc.nextInt();
            if (numero > 0) {
                totalPositivos = totalPositivos + numero;
            } else if (numero < 0) {
                cantidadNegativos++;
            }
        } while (numero != 0);

        System.out.println("Total de la suma de los positivos: " + totalPositivos);
        System.out.println("Cantidad de números negativos ingresados: " + cantidadNegativos);
        
        sc.close();
    }
}