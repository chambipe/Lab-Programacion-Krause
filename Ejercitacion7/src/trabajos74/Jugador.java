package trabajos74;

public class Jugador {
    private String nombreCompleto;
    private String posicion;
    private int edad;
    private String equipoClub;
    private boolean convocado;

    public Jugador(String nombreCompleto, String posicion, int edad, String equipoClub, boolean convocado) {
        this.nombreCompleto = nombreCompleto;
        this.posicion = posicion;
        this.edad = edad;
        this.equipoClub = equipoClub;
        this.convocado = convocado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipoClub() {
        return equipoClub;
    }

    public void setEquipoClub(String equipoClub) {
        this.equipoClub = equipoClub;
    }

    public boolean isConvocado() {
        return convocado;
    }

    public void setConvocado(boolean convocado) {
        this.convocado = convocado;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombreCompleto + " | Posición: " + posicion + " | Edad: " + edad + " | Club: " + equipoClub + " | ¿Convocado?: " + (convocado ? "Sí" : "No");
    }
}