package trabajos43;

public abstract class Producto {
    protected int codigo;
    private double precio;

    public Producto(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public abstract double calcularPrecioFinal();

    public double getPrecio() {
        return this.precio;
    }
}