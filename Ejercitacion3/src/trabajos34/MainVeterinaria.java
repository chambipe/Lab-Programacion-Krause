package trabajos34;

public class MainVeterinaria {
    public static void main(String[] args) {
        Veterinario vet1 = new Veterinario("Dr. Gomez");
        Veterinario vet2 = new Veterinario("Dr. Paz");
        Veterinario vet3 = new Veterinario("Dra. Rios");

        // Este es el animal que es el mismo para todos
        Perro perroCompartido = new Perro("Firulais");

        // Otros animales para completar
        Perro p2 = new Perro("Toby");
        Gato g1 = new Gato("Pelusa");

        System.out.println("Veterinarios creados. Firulais es el paciente compartido.");
    }
}