package trabajos_tienda;

public interface Stockeable {
    boolean hayStock(int cantidad);
    void reducirStock(int cantidad);
}