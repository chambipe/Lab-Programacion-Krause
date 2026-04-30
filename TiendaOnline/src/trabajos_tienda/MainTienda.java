package trabajos_tienda;

public class MainTienda {
    public static void main(String[] args) {
        ProductoFisico monitor = new ProductoFisico(1, "Monitor 144Hz", 150000.0, 10, 5.5);
        ProductoDigital curso = new ProductoDigital(2, "Curso POO Avanzado", 8000.0, 999, "MP4");

        Cliente aaron = new Cliente(101, "Aaron Serrano", "aaron.serrano@uade.edu.ar");
        
        aaron.getCarrito().agregarProducto(monitor, 1);
        aaron.getCarrito().agregarProducto(curso, 1);

        double totalFinal = aaron.getCarrito().calcularTotal();
        
        Pago pagoActual = new Pago("TRX-5544", "Tarjeta de Credito", totalFinal);
        Envio envioActual = new Envio("AR-99221", "Av. Siempre Viva 742", "Andreani");

        Pedido nuevoPedido = new Pedido(10001, aaron.getCarrito().getItems(), pagoActual, envioActual);
        
        aaron.registrarPedidoEnHistorial(nuevoPedido);
        
        monitor.reducirStock(1);
        curso.reducirStock(1);
        
        aaron.getCarrito().vaciar();

        Notificador noti = new Notificador();
        noti.enviarConfirmacion(aaron, nuevoPedido);

        System.out.println("Flujo de compra finalizado con éxito.");
    }
}