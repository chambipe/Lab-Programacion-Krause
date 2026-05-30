package trabajosArrayList;

public class MainEscuela {
    public static void main(String[] args) {
        Curso curso = new Curso("5°2°");

        Estudiante e1 = new Estudiante("Aaron Serrano", "11111111", 8.5);
        Estudiante e2 = new Estudiante("Lucas Gomez", "22222222", 7.0);
        Estudiante e3 = new Estudiante("Maria Perez", "33333333", 9.2);

        curso.inscribir(e1);
        curso.inscribir(e2);
        curso.inscribir(e3);

        System.out.println("Cantidad de alumnos inscritos: " + curso.cantidadAlumnos());

        curso.darDeBaja(1);

        System.out.println("Lista de alumnos restantes:");
        curso.listarAlumnos();
    }
}