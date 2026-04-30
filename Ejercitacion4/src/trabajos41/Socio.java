package trabajos41;
import java.util.ArrayList;

public class Socio {
    private int nroSocio;
    private String nombre;
    private ArrayList<Reserva> historialReservas;

    public Socio(int nroSocio, String nombre) {
        this.nroSocio = nroSocio;
        this.nombre = nombre;
        this.historialReservas = new ArrayList<Reserva>();
    }

    public void añadirReserva(Reserva nuevaReserva) {
        this.historialReservas.add(nuevaReserva);
    }
}