package trabajos81;

public class Tutor {
    private String nombreCompleto;
    private String telefonoContacto;

    public Tutor(String nombreCompleto, String telefonoContacto) {
        this.nombreCompleto = nombreCompleto;
        this.telefonoContacto = telefonoContacto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String toString() {
        return "Tutor: " + nombreCompleto + " (Tel: " + telefonoContacto + ")";
    }
}