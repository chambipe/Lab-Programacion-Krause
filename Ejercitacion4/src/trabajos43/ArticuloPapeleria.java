package trabajos43;

public class ArticuloPapeleria extends Producto {
    private String tipoMaterial;

    public ArticuloPapeleria(int codigo, double precio, String tipoMaterial) {
        super(codigo, precio);
        this.tipoMaterial = tipoMaterial;
    }

    public double calcularPrecioFinal() {
        return this.getPrecio() * 1.21;
    }
}