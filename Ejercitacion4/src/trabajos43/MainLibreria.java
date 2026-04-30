package trabajos43;

public class MainLibreria {
    public static void main(String[] args) {
        Libro libro1 = new Libro(701, 15000, "Borges");
        ArticuloPapeleria art1 = new ArticuloPapeleria(801, 2000, "Carton");

        System.out.println("Precio final libro: " + libro1.calcularPrecioFinal());
        System.out.println("Precio final papeleria: " + art1.calcularPrecioFinal());
    }
}