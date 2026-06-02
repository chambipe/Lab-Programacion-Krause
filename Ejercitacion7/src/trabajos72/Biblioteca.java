package trabajos72;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> coleccionLibros;

    public Biblioteca() {
        this.coleccionLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro unLibro) {
        this.coleccionLibros.add(unLibro);
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < coleccionLibros.size(); i++) {
            System.out.println(coleccionLibros.get(i).toString());
        }
    }

    public int contarTotalLibros() {
        return this.coleccionLibros.size();
    }
}