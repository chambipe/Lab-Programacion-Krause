package trabajos42;

public class MainFabrica {
    public static void main(String[] args) {
        Operario op1 = new Operario(501, 800000, 5000);
        Gerente ge1 = new Gerente(101, 1500000, 200000);

        System.out.println("Empleados de la fabrica instanciados.");
    }
}