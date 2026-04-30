package trabajos_tienda;
import java.util.ArrayList;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String correo;
    private Carrito_Compra carrito;
    private ArrayList<Pedido> historialPedidos;

    public Cliente(int idCliente, String nombre, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.carrito = new Carrito_Compra();
        this.historialPedidos = new ArrayList<Pedido>();
    }

    public Carrito_Compra getCarrito() {
        return carrito;
    }

    public void registrarPedidoEnHistorial(Pedido p) {
        this.historialPedidos.add(p);
    }

    public String getNombre() {
        return nombre;
    }
}