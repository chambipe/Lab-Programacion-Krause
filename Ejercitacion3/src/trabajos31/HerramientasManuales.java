package trabajos31;

public class HerramientasManuales extends Herramientas {
    private String tipoEmpunadura;

    public HerramientasManuales(int codigo, String marca, String tipoEmpunadura) {
        super(codigo, marca); 
        this.tipoEmpunadura = tipoEmpunadura;
    }
}