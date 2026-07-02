package trabajos81;

public class VerificadorAcademico {

    public void autorizarExamenEspecial(Alumno estudiante) throws AlumnoLibreException {
        System.out.println("Iniciando auditoría académica para: " + estudiante.getNombre());
        
        if (estudiante.getInasistencias() > 15) {
            estudiante.setEstadoAcademico("Libre");
            throw new AlumnoLibreException("Error Académico: El estudiante con legajo " + estudiante.getLegajo() + 
                                           " superó las 15 inasistencias permitidas y quedó en condición LIBRE.");
        }
        
        System.out.println("Autorización concedida. El estudiante cumple con los requisitos regulares.");
    }

    public void procesarInscripcionMesa(Alumno estudiante) {
        try {
            autorizarExamenEspecial(estudiante);
            System.out.println("Resultado: Inscripción completada exitosamente.");
        } catch (AlumnoLibreException e) {
            System.out.println("Excepción Propia Capturada -> " + e.getMessage());
            System.out.println("Acción aplicada: Se bloqueó el trámite del alumno.");
        } finally {
            System.out.println("[Bitácora de Seguridad]: Finalizó el procesamiento de verificación para el legajo " + estudiante.getLegajo());
        }
    }
}