package trabajos45;

public class MenuVegano extends Menu {
    private String proteinaVegetal;

    public MenuVegano(String diaSemana, int caloriasTotales, String proteinaVegetal) {
        super(diaSemana, caloriasTotales);
        this.proteinaVegetal = proteinaVegetal;
    }
}