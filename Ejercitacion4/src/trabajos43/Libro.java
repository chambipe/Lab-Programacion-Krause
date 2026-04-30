package trabajos43;

public class Libro extends Producto {
    private String autor;

    public Libro(int codigo, double precio, String autor) {
        super(codigo, precio);
        this.autor = autor;
    }

    public double calcularPrecioFinal() {
        return this.getPrecio();
    }
}