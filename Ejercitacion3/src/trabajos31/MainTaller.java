package trabajos31;

public class MainTaller {
    public static void main(String[] args) {
        Herramientas h1 = new HerramientasManuales(101, "Stanley", "Goma");
        Herramientas h2 = new HerramientasManuales(102, "Bahco", "Madera");
        Herramientas h3 = new HerramientasElectricas(201, "Bosch", 220);
        Herramientas h4 = new HerramientasElectricas(202, "Makita", 220);
        Herramientas h5 = new HerramientasManuales(103, "Tramontina", "Plastico");

        Herramientas[] lista = {h1, h2, h3, h4, h5};

        System.out.println("--- LISTADO DEL TALLER ---");
        for (int i = 0; i < lista.length; i++) {
            lista[i].usar();
            
            if (lista[i] instanceof HerramientasElectricas) {
                ((HerramientasElectricas) lista[i]).conectar();
            }
            lista[i].devolver();
            System.out.println("--------------------");
        }
    }
}