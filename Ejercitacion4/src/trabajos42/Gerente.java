package trabajos42;

public class Gerente extends Empleado {
    private double bonoResponsabilidad;

    public Gerente(int legajo, double sueldoBase, double bonoResponsabilidad) {
        super(legajo, sueldoBase);
        this.bonoResponsabilidad = bonoResponsabilidad;
    }
}