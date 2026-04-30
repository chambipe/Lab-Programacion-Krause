package trabajos31;

public class Herramientas {
    protected int codigo;
    protected String marca;

    public Herramientas(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
    }

    public void usar() {
        System.out.println("Usando herramienta: " + marca);
    }

    public void devolver() {
        System.out.println("Devolviendo código: " + codigo);
    }
}