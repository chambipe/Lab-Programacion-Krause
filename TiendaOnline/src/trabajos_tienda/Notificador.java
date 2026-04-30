package trabajos_tienda;

public class Notificador {
    public void enviarConfirmacion(Cliente cliente, Pedido pedido) {
        System.out.println("Enviando correo a: " + cliente.getNombre());
        System.out.println("Confirmacion del pedido Nro: " + pedido.getNumeroPedido());
    }
}