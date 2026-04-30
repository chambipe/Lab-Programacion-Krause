package trabajos_tienda;

public class Pago {
    private String idTransaccion;
    private String metodo;
    private double montoTotal;
    private String estado;

    public Pago(String id, String metodo, double monto) {
        this.idTransaccion = id;
        this.metodo = metodo;
        this.montoTotal = monto;
        this.estado = "PROCESADO";
    }

    public String getEstado() {
        return estado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }
}