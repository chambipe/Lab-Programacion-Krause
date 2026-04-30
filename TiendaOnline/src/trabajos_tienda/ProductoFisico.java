package trabajos_tienda;

public class ProductoFisico extends Producto {
    private double peso;
    private double costoEnvioBase;

    public ProductoFisico(int id, String nombre, double precio, int stock, double peso) {
        super(id, nombre, precio, stock);
        this.peso = peso;
        this.costoEnvioBase = 500.0;
    }

    public double getPrecioVenta() {
        return this.precioBase + (this.peso * 0.15);
    }

    public void aplicarDescuento(double porcentaje) {
        this.precioBase -= (this.precioBase * (porcentaje / 100));
    }
    
    public double getCostoEnvioBase() {
        return costoEnvioBase;
    }
}