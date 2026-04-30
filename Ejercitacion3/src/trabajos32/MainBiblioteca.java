package trabajos32;

public class MainBiblioteca {
    public static void main(String[] args) {

        Socio s1 = new Socio("Aaron", 1);
        Socio s2 = new Socio("Marta", 2);
        Socio s3 = new Socio("Jose", 3);

        Libro l1 = new Libro("978-1", "Java para Principiantes");
        Libro l2 = new Libro("978-2", "Pensar en Objetos");
        Libro l3 = new Libro("978-3", "UML Guia Rapida");
        Libro l4 = new Libro("978-4", "Estructuras de Datos");
        Libro l5 = new Libro("978-5", "Logica de Programacion");

        System.out.println("Biblioteca cargada con 3 socios y 5 libros.");
    }
}