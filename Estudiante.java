public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // 1. Constructor por defecto
    public Estudiante() {
        this("Sin nombre", 0, "Sin curso");
    }

    // 2. Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "No asignado");
    }

    // 3. Constructor con todos los parámetros usando this()
    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }

    // Método main para probar
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Pedro", 21);
        Estudiante e3 = new Estudiante("Ana", 22, "POO");

        e1.mostrarDetalles();
        System.out.println("------");
        e2.mostrarDetalles();
        System.out.println("------");
        e3.mostrarDetalles();
    }
}
