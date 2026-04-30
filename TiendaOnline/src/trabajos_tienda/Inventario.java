package trabajos_tienda;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> catalogo;

    public Inventario() {
        this.catalogo = new ArrayList<Producto>();
    }

    public void cargarProducto(Producto p) {
        this.catalogo.add(p);
    }

    public void mostrarDisponibles() {
        for (Producto p : catalogo) {
            System.out.println(p.getNombre() + " - Stock: " + p.stockActual);
        }
    }
}