package trabajos41;

public class MainClub {
    public static void main(String[] args) {
        Socio s1 = new Socio(100, "Aaron Serrano");
        Reserva r1 = new Reserva("2024-05-10", "Tenis");
        Reserva r2 = new Reserva("2024-05-12", "Futbol");

        s1.añadirReserva(r1);
        s1.añadirReserva(r2);

        System.out.println("Socio y reservas creadas.");
    }
}