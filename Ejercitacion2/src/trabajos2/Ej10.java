package trabajos2;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] palabra = {'j', 'a', 'v', 'a'};
        char[] progreso = {'j', '_', '_', '_'}; // Mostramos solo la primera
        int aciertos = 1;

        System.out.println("Adivina la palabra (pista: tiene 4 letras)");

        while (aciertos < palabra.length) {
            System.out.print("Palabra actual: ");
            System.out.println(progreso);
            
            System.out.print("Ingresa una letra: ");
            char letra = sc.next().charAt(0);

            boolean encontroAlguna = false;
            for (int i = 1; i < palabra.length; i++) {
                if (palabra[i] == letra && progreso[i] == '_') {
                    progreso[i] = letra;
                    aciertos++;
                    encontroAlguna = true;
                }
            }

            if (!encontroAlguna) {
                System.out.println("Error: Esa letra no va ahí o ya la pusiste.");
            }
        }

        System.out.println("¡Ganaste! La palabra es: java");
        sc.close();
    }
}