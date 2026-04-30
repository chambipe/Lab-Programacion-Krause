package trabajos46;

public class Tren extends Unidad {
    private int cantidadVagones;

    public Tren(int idInterno, int capacidadPasajeros, int cantidadVagones) {
        super(idInterno, capacidadPasajeros);
        this.cantidadVagones = cantidadVagones;
    }

    public void arrancar() {
        System.out.println("Tren de " + cantidadVagones + " vagones arrancando.");
    }

    public void frenar() {
        System.out.println("Tren frenando.");
    }
}