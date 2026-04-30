package trabajos_tienda;
import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private String fecha;
    private ArrayList<LineaProducto> lineasPedido;
    private Pago pagoRealizado;
    private Envio datosEnvio;

    public Pedido(int numero, ArrayList<LineaProducto> items, Pago pago, Envio envio) {
        this.numeroPedido = numero;
        this.fecha = "2024-05-28";
        this.lineasPedido = new ArrayList<LineaProducto>(items);
        this.pagoRealizado = pago;
        this.datosEnvio = envio;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }
}