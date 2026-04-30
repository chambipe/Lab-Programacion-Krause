package trabajos31;

public class HerramientasElectricas extends Herramientas {
    private int voltaje;

    public HerramientasElectricas(int codigo, String marca, int voltaje) {
        super(codigo, marca); 
        this.voltaje = voltaje;
    }

    public void conectar() {
        System.out.println("Conectando a " + voltaje + "V");
    }
}