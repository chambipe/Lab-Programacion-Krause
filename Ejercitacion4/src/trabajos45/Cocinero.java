package trabajos45;
import java.util.ArrayList;

public class Cocinero {
    private String nombre;
    private ArrayList<Menu> menusSupervisados;

    public Cocinero(String nombre) {
        this.nombre = nombre;
        this.menusSupervisados = new ArrayList<Menu>();
    }
}