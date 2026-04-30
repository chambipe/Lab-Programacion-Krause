package trabajos44;
import java.util.ArrayList;

public class Playlist {
    private String nombre;
    private String genero;
    private ArrayList<Cancion> canciones;

    public Playlist(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.canciones = new ArrayList<Cancion>();
    }

    public void agregarCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}