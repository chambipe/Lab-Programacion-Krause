package trabajos74;

public class Main {
    public static void main(String[] args) {
        String[][] datos = {
            {"Emiliano Martinez", "Arquero", "33", "Aston Villa", "true"},
            {"Cristian Romero", "Defensor", "28", "Tottenham", "true"},
            {"Nicolas Otamendi", "Defensor", "38", "Benfica", "true"},
            {"Nahuel Molina", "Defensor", "28", "Atletico Madrid", "true"},
            {"Enzo Fernandez", "Mediocampista", "25", "Chelsea", "true"},
            {"Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "true"},
            {"Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "true"},
            {"Lionel Messi", "Delantero", "39", "Inter Miami", "true"},
            {"Julian Alvarez", "Delantero", "26", "Atletico Madrid", "true"},
            {"Lautaro Martinez", "Delantero", "29", "Inter Milan", "true"},
            {"Paulo Dybala", "Delantero", "33", "Roma", "false"},
            {"Mike Maignan", "Arquero", "31", "Milan", "true"},
            {"William Saliba", "Defensor", "25", "Arsenal", "true"},
            {"Theo Hernandez", "Defensor", "29", "Milan", "true"},
            {"Jules Kounde", "Defensor", "28", "Barcelona", "true"},
            {"Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "true"},
            {"Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "true"},
            {"Adrien Rabiot", "Mediocampista", "31", "Marseille", "true"},
            {"Kylian Mbappe", "Delantero", "28", "Real Madrid", "true"},
            {"Ousmane Dembele", "Delantero", "29", "PSG", "true"},
            {"Marcus Thuram", "Delantero", "29", "Inter Milan", "true"},
            {"Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "false"}
        };

        Seleccion miSeleccion = new Seleccion();

        for (int i = 0; i < datos.length; i++) {
            String nombre = datos[i][0];
            String posicion = datos[i][1];
            int edad = Integer.parseInt(datos[i][2]);
            String club = datos[i][3];
            boolean convocado = Boolean.parseBoolean(datos[i][4]);

            Jugador jugador = new Jugador(nombre, posicion, edad, club, convocado);
            miSeleccion.agregarJugador(jugador);
        }

        System.out.println("=== LISTADO DE JUGADORES CONVOCADOS ===");
        miSeleccion.mostrarConvocados();

        System.out.println("\n=== LISTADO DE JUGADORES NO CONVOCADOS ===");
        miSeleccion.mostrarNoConvocados();

        System.out.println("\n=== CANTIDAD DE JUGADORES POR ORIGEN ===");
        miSeleccion.contarPorSeleccion();

        System.out.println("\n=== CANTIDAD DE JUGADORES POR POSICIÓN ===");
        miSeleccion.contarPorPosicion();

        System.out.println("\n=== EDAD PROMEDIO DEL PLANTEL ===");
        System.out.println("El promedio de edad es: " + miSeleccion.promedioEdad() + " años");

        System.out.println("\n=== JUGADORES EXTREMOS POR EDAD ===");
        System.out.println("Más joven -> " + miSeleccion.jugadorMasJoven());
        System.out.println("Más veterano -> " + miSeleccion.jugadorMasVeterano());

        System.out.println("\n=== VERIFICACIÓN DE CONVOCATORIA (Lionel Messi) ===");
        System.out.println("¿Está convocado Messi?: " + (miSeleccion.estaConvocado("Lionel Messi") ? "Sí" : "No"));

        System.out.println("\n=== BÚSQUEDA POR POSICIÓN (Arquero) ===");
        miSeleccion.buscarPorPosicion("Arquero");

        System.out.println("\n=== BÚSQUEDA POR EQUIPO (Real Madrid) ===");
        miSeleccion.buscarPorEquipo("Real Madrid");

        System.out.println("\n=== ELIMINACIÓN DE JUGADOR (Paulo Dybala) ===");
        miSeleccion.eliminarJugador("Paulo Dybala");

        System.out.println("\n=== PLANTEL ORDENADO POR EDAD ===");
        miSeleccion.ordenarPorEdad();
        miSeleccion.mostrarPlantelCompleto();
    }
}