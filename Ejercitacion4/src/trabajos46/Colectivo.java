package trabajos46;

public class Colectivo extends Unidad {
    private int numeroLinea;

    public Colectivo(int idInterno, int capacidadPasajeros, int numeroLinea) {
        super(idInterno, capacidadPasajeros);
        this.numeroLinea = numeroLinea;
    }

    public void arrancar() {
        System.out.println("Colectivo linea " + numeroLinea + " arrancando.");
    }

    public void frenar() {
        System.out.println("Colectivo linea " + numeroLinea + " frenando.");
    }
}