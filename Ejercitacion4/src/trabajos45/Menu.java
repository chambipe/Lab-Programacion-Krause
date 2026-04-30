package trabajos45;

public class Menu {
    protected String diaSemana;
    protected int caloriasTotales;

    public Menu(String diaSemana, int caloriasTotales) {
        this.diaSemana = diaSemana;
        setCaloriasTotales(caloriasTotales);
    }

    public void setCaloriasTotales(int caloriasTotales) {
        if (caloriasTotales >= 0) {
            this.caloriasTotales = caloriasTotales;
        } else {
            this.caloriasTotales = 0;
        }
    }
}