package trabajos46;

public abstract class Unidad {
    protected int idInterno;
    protected int capacidadPasajeros;

    public Unidad(int idInterno, int capacidadPasajeros) {
        this.idInterno = idInterno;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public abstract void arrancar();
    public abstract void frenar();
}