package trabajos81;

public class Main {
    public static void main(String[] args) {
        Escuela institucion = new Escuela();
        VerificadorAcademico verificador = new VerificadorAcademico();

        Tutor tutor1 = new Tutor("Carlos Gómez", "11-2345-6789");
        Alumno al1 = new Alumno("Franco Armani", "L201", 5, "Regular", tutor1);

        Alumno al2 = new Alumno("Enzo Pérez", "L202", 18, "Regular", null);

        institucion.registrarAlumno(al1);
        institucion.registrarAlumno(al2);

        System.out.println("=== PRUEBA CONSIGNA 1: CONSULTA DE ALUMNOS POR ÍNDICE ===");
        institucion.consultarAlumnoPorPosicion(0);
        institucion.consultarAlumnoPorPosicion(4);
        System.out.println("---------------------------------------------------------\n");

        System.out.println("=== PRUEBA CONSIGNA 2 Y 4: CARGA DE INASISTENCIAS Y VALIDACIÓN ===");
        institucion.cargarInasistenciasPorTeclado(0, "3");
        institucion.cargarInasistenciasPorTeclado(0, "-4");
        institucion.cargarInasistenciasPorTeclado(0, "ocho_faltas");
        System.out.println("---------------------------------------------------------\n");

        System.out.println("=== PRUEBA CONSIGNA 3: CONTROL DE REFERENCIAS NULAS (TUTOR) ===");
        institucion.consultarTutorDeAlumno(0);
        institucion.consultarTutorDeAlumno(1);
        System.out.println("---------------------------------------------------------\n");

        System.out.println("=== PRUEBA CONSIGNA 5: EXCEPCIÓN PERSONALIZADA Y BLOQUE FINALLY ===");
        System.out.println("--- Caso Alumno 1 (Dentro de los límites habituales) ---");
        verificador.procesarInscripcionMesa(al1);
        System.out.println();
        
        System.out.println("--- Caso Alumno 2 (Supera el límite de faltas institucional) ---");
        verificador.procesarInscripcionMesa(al2);
        System.out.println("---------------------------------------------------------");
    }
}