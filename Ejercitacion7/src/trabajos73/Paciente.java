package trabajos73;

public class Paciente {
    private String nombre;
    private String dni;
    private int edad;
    private double peso;
    private boolean estaHospitalizado;

    public Paciente(String nombre, String dni, int edad, double peso, boolean estaHospitalizado) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.estaHospitalizado = estaHospitalizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEstaHospitalizado() {
        return estaHospitalizado;
    }

    public void setEstaHospitalizado(boolean estaHospitalizado) {
        this.estaHospitalizado = estaHospitalizado;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " | DNI: " + dni + " | Edad: " + edad + " | Peso: " + peso + " kg | Hospitalizado: " + (estaHospitalizado ? "Sí" : "No");
    }
}