package trabajos_tienda;
import java.util.ArrayList;

public class Categoria {
    private String nombreCategoria;
    private ArrayList<Producto> productos;

    public Categoria(String nombre) {
        this.nombreCategoria = nombre;
        this.productos = new ArrayList<Producto>();
    }

    public void vincularProducto(Producto p) {
        this.productos.add(p);
    }
}