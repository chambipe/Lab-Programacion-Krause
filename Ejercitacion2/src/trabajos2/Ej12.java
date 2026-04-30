package trabajos2;

public class Ej12 {
    public static void main(String[] args) {
        int[] lista = {15, 2, 8, 99, 45, 1, 30, 7};
        int mayor = lista[0];
        int menor = lista[0];

        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
            if (lista[i] < menor) {
                menor = lista[i];
            }
        }

        System.out.println("El número más grande es: " + mayor);
        System.out.println("El número más pequeño es: " + menor);
    }
}