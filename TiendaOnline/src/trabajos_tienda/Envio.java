package trabajos_tienda;

public class Envio {
    private String codigoSeguimiento;
    private String direccionEntrega;
    private String empresaTransporte;
    private boolean entregado;

    public Envio(String codigo, String direccion, String empresa) {
        this.codigoSeguimiento = codigo;
        this.direccionEntrega = direccion;
        this.empresaTransporte = empresa;
        this.entregado = false;
    }

    public void marcarComoEntregado() {
        this.entregado = true;
    }
}