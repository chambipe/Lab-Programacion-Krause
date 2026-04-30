package trabajos_tienda;
import java.util.ArrayList;

public class Carrito_Compra {
    private ArrayList<LineaProducto> items;

    public Carrito_Compra() {
        this.items = new ArrayList<LineaProducto>();
    }

    public void agregarProducto(Producto p, int cantidad) {
        if (p.hayStock(cantidad)) {
            this.items.add(new LineaProducto(p, cantidad));
        }
    }

    public void quitarProducto(int indice) {
        if (indice >= 0 && indice < items.size()) {
            this.items.remove(indice);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (LineaProducto linea : items) {
            total += linea.calcularSubtotal();
        }
        return total;
    }

    public ArrayList<LineaProducto> getItems() {
        return items;
    }

    public void vaciar() {
        this.items.clear();
    }
}