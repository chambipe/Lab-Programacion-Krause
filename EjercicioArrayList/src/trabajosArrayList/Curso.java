package trabajosArrayList;
import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<Estudiante>();
    }

    public void inscribir(Estudiante e) {
        this.alumnos.add(e);
    }

    public void darDeBaja(int indice) {
        if (indice >= 0 && indice < this.alumnos.size()) {
            this.alumnos.remove(indice);
        }
    }

    public void listarAlumnos() {
        for (Estudiante e : this.alumnos) {
            e.mostrarFicha();
        }
    }

    public int cantidadAlumnos() {
        return this.alumnos.size();
    }
}