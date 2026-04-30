package trabajos_tienda;

public class ProductoDigital extends Producto {
    private String formato;
    private double tamañoArchivo;

    public ProductoDigital(int id, String nombre, double precio, int stock, String formato) {
        super(id, nombre, precio, stock);
        this.formato = formato;
    }

    public double getPrecioVenta() {
        return this.precioBase;
    }

    public void aplicarDescuento(double porcentaje) {
        this.precioBase -= (this.precioBase * (porcentaje / 100));
    }
}