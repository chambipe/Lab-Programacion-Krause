package trabajos46;

public class MainTransporte {
    public static void main(String[] args) {
        Colectivo cole = new Colectivo(50, 40, 152);
        Tren tren = new Tren(100, 500, 8);

        cole.arrancar();
        tren.arrancar();
    }
}