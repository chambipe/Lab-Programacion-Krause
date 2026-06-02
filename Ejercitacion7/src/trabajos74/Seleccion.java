package trabajos74;

import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Jugador> plantel;

    public Seleccion() {
        this.plantel = new ArrayList<>();
    }

    public void agregarJugador(Jugador futbolista) {
        this.plantel.add(futbolista);
    }

    public void eliminarJugador(String nombre) {
        for (int i = 0; i < plantel.size(); i++) {
            if (plantel.get(i).getNombreCompleto().equalsIgnoreCase(nombre)) {
                plantel.remove(i);
                break;
            }
        }
    }

    public void buscarPorPosicion(String posicionBuscada) {
        for (int i = 0; i < plantel.size(); i++) {
            Jugador j = plantel.get(i);
            if (j.getPosicion().equalsIgnoreCase(posicionBuscada)) {
                System.out.println(j.toString());
            }
        }
    }

    public void mostrarConvocados() {
        for (int i = 0; i < plantel.size(); i++) {
            Jugador j = plantel.get(i);
            if (j.isConvocado()) {
                System.out.println(j.toString());
            }
        }
    }

    public void mostrarNoConvocados() {
        for (int i = 0; i < plantel.size(); i++) {
            Jugador j = plantel.get(i);
            if (!j.isConvocado()) {
                System.out.println(j.toString());
            }
        }
    }

    public void contarPorSeleccion() {
        int deArgentina = 0;
        int deFrancia = 0;
        
        for (int i = 0; i < plantel.size(); i++) {
            String club = plantel.get(i).getEquipoClub();
            String nombre = plantel.get(i).getNombreCompleto();
            
            if (club.equals("Aston Villa") || club.equals("Tottenham") || club.equals("Benfica") || 
                club.equals("Chelsea") || club.equals("Liverpool") || club.equals("Inter Milan") || 
                club.equals("Roma") || club.equals("Inter Miami") || club.equals("Atletico Madrid")) {
                
                if (club.equals("Atletico Madrid") && nombre.equals("Antoine Griezmann")) {
                    deFrancia++;
                } else if (club.equals("Inter Milan") && nombre.equals("Marcus Thuram")) {
                    deFrancia++;
                } else {
                    deArgentina++;
                }
            } else {
                deFrancia++;
            }
        }
        System.out.println("Cantidad de jugadores de Argentina: " + deArgentina);
        System.out.println("Cantidad de jugadores de Francia: " + deFrancia);
    }

    public Jugador jugadorMasJoven() {
        if (plantel.isEmpty()) return null;
        Jugador joven = plantel.get(0);
        for (int i = 1; i < plantel.size(); i++) {
            if (plantel.get(i).getEdad() < joven.getEdad()) {
                joven = plantel.get(i);
            }
        }
        return joven;
    }

    public Jugador jugadorMasVeterano() {
        if (plantel.isEmpty()) return null;
        Jugador viejo = plantel.get(0);
        for (int i = 1; i < plantel.size(); i++) {
            if (plantel.get(i).getEdad() > viejo.getEdad()) {
                viejo = plantel.get(i);
            }
        }
        return viejo;
    }

    public void buscarPorEquipo(String clubBuscado) {
        for (int i = 0; i < plantel.size(); i++) {
            Jugador j = plantel.get(i);
            if (j.getEquipoClub().equalsIgnoreCase(clubBuscado)) {
                System.out.println(j.toString());
            }
        }
    }

    public void ordenarPorEdad() {
        int n = plantel.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (plantel.get(j).getEdad() > plantel.get(j + 1).getEdad()) {
                    Jugador aux = plantel.get(j);
                    plantel.set(j, plantel.get(j + 1));
                    plantel.set(j + 1, aux);
                }
            }
        }
    }

    public void contarPorPosicion() {
        int arq = 0, def = 0, med = 0, del = 0;
        for (int i = 0; i < plantel.size(); i++) {
            String pos = plantel.get(i).getPosicion();
            if (pos.equalsIgnoreCase("Arquero")) arq++;
            else if (pos.equalsIgnoreCase("Defensor")) def++;
            else if (pos.equalsIgnoreCase("Mediocampista")) med++;
            else if (pos.equalsIgnoreCase("Delantero")) del++;
        }
        System.out.println("Arqueros: " + arq + " | Defensores: " + def + " | Mediocampistas: " + med + " | Delanteros: " + del);
    }

    public boolean estaConvocado(String nombreAtleta) {
        for (int i = 0; i < plantel.size(); i++) {
            if (plantel.get(i).getNombreCompleto().equalsIgnoreCase(nombreAtleta)) {
                return plantel.get(i).isConvocado();
            }
        }
        return false;
    }

    public double promedioEdad() {
        if (plantel.isEmpty()) return 0;
        int acumulador = 0;
        for (int i = 0; i < plantel.size(); i++) {
            acumulador += plantel.get(i).getEdad();
        }
        return (double) acumulador / plantel.size();
    }

    public void mostrarPlantelCompleto() {
        for (int i = 0; i < plantel.size(); i++) {
            System.out.println(plantel.get(i).toString());
        }
    }
}