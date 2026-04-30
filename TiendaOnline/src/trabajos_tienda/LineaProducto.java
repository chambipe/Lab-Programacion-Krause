package trabajos_tienda;

public class LineaProducto {
    private int cantidad;
    private Producto producto;

    public LineaProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecioVenta() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}