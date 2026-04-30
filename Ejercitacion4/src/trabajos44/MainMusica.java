package trabajos44;

public class MainMusica {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Song 1", 3.5);
        Cancion c2 = new Cancion("Song 2", 4.2);
        
        Playlist p1 = new Playlist("Favoritos", "Rock");
        p1.agregarCancion(c1);
        p1.agregarCancion(c2);

        System.out.println("Playlist creada con canciones.");
    }
}