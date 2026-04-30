package trabajos_tienda;

public abstract class Producto implements Vendible, Stockeable {
    protected int id;
    protected String nombre;
    protected double precioBase;
    protected int stockActual;

    public Producto(int id, String nombre, double precioBase, int stockActual) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stockActual = stockActual;
    }

    public boolean hayStock(int cantidad) {
        return this.stockActual >= cantidad;
    }

    public void reducirStock(int cantidad) {
        if (hayStock(cantidad)) {
            this.stockActual -= cantidad;
        }
    }

    public String getNombre() {
        return nombre;
    }
}