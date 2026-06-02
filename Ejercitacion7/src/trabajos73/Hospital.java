package trabajos73;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Paciente> nominaPacientes;

    public Hospital() {
        this.nominaPacientes = new ArrayList<>();
    }

    public void registrarPaciente(Paciente nuevoPaciente) {
        this.nominaPacientes.add(nuevoPaciente);
    }

    public void mostrarListadoCompleto() {
        for (int i = 0; i < nominaPacientes.size(); i++) {
            System.out.println(nominaPacientes.get(i).toString());
        }
    }

    public int obtenerCantidadTotal() {
        return this.nominaPacientes.size();
    }

    public void informarDatosPorIndice(int indice) {
        if (indice >= 0 && indice < nominaPacientes.size()) {
            Paciente p = nominaPacientes.get(indice);
            System.out.println("Información del Paciente en índice [" + indice + "]:");
            System.out.println(" - Nombre: " + p.getNombre());
            System.out.println(" - Edad: " + p.getEdad() + " años");
            System.out.println(" - ¿Se encuentra hospitalizado?: " + (p.isEstaHospitalizado() ? "Sí" : "No"));
        } else {
            System.out.println("El índice especificado no es válido.");
        }
    }
}