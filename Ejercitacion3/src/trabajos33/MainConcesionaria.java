package trabajos33;

public class MainConcesionaria {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Matias");
        Vendedor v2 = new Vendedor("Lorena");
        Vendedor v3 = new Vendedor("Lucas");

        Vehiculo[] flota = new Vehiculo[10];
        // Cargamos 5 autos y 5 motos
        for(int i = 0; i < 5; i++) {
            flota[i] = new Auto("AAA" + i, "Sedan V" + i);
        }
        for(int i = 5; i < 10; i++) {
            flota[i] = new Moto("BBB" + i, "Sport 250");
        }
        System.out.println("Vendedores y 10 vehiculos listos.");
    }
}