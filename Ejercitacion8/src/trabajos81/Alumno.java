package trabajos81;

public class Alumno {
    private String nombre;
    private String legajo;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutorResponsable;

    public Alumno(String nombre, String legajo, int inasistencias, String estadoAcademico, Tutor tutorResponsable) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.inasistencias = inasistencias;
        this.estadoAcademico = estadoAcademico;
        this.tutorResponsable = tutorResponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void registrarInasistenciasValidando(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Error: No se permite registrar una cantidad negativa de inasistencias.");
        }
        this.inasistencias += cantidad;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public void setEstadoAcademico(String estadoAcademico) {
        this.estadoAcademico = estadoAcademico;
    }

    public Tutor getTutorResponsable() {
        return tutorResponsable;
    }

    public void setTutorResponsable(Tutor tutorResponsable) {
        this.tutorResponsable = tutorResponsable;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " [Legajo: " + legajo + "] - Inasistencias: " + inasistencias + " - Estado: " + estadoAcademico;
    }
}