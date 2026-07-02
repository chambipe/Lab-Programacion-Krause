package trabajos81;

import java.util.ArrayList;

public class Escuela {
    private ArrayList<Alumno> nominaAlumnos;

    public Escuela() {
        this.nominaAlumnos = new ArrayList<>();
    }

    public void registrarAlumno(Alumno nuevoAlumno) {
        this.nominaAlumnos.add(nuevoAlumno);
    }

    public void consultarAlumnoPorPosicion(int posicion) {
        try {
            Alumno al = nominaAlumnos.get(posicion);
            System.out.println("Alumno localizado en la posición [" + posicion + "]:");
            System.out.println(al.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: El índice " + posicion + " está fuera de rango. No existe ese registro.");
        }
    }

    public void cargarInasistenciasPorTeclado(int posicion, String entradaTeclado) {
        try {
            int faltasAAgregar = Integer.parseInt(entradaTeclado);
            Alumno al = nominaAlumnos.get(posicion);
            
            al.registrarInasistenciasValidando(faltasAAgregar);
            System.out.println("Se añadieron " + faltasAAgregar + " faltas con éxito a: " + al.getNombre());
        } catch (NumberFormatException e) {
            System.out.println("Excepción capturada: La entrada '" + entradaTeclado + "' no se puede convertir a un número entero válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada de validación -> " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: Imposible aplicar inasistencias. La posición " + posicion + " no existe.");
        }
    }

    public void consultarTutorDeAlumno(int posicion) {
        try {
            Alumno al = nominaAlumnos.get(posicion);
            System.out.println("Consultando el tutor asignado al estudiante: " + al.getNombre());
            System.out.println(al.getTutorResponsable().toString());
        } catch (NullPointerException e) {
            System.out.println("Excepción capturada: El alumno seleccionado no posee un tutor registrado en el sistema (referencia nula).");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: No se pudo verificar el tutor porque el índice " + posicion + " es inválido.");
        }
    }

    public ArrayList<Alumno> getNominaAlumnos() {
        return this.nominaAlumnos;
    }
}