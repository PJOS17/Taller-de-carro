//Pablo Orantes 25563
//Kevin Moreno 25730



public class Mecanico {
    private String nombre;
    private int edad;

    public Mecanico(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Soy el mecánico " + nombre + " y tengo " + edad + " años.");
    }

    public void trabajar() {
        System.out.println("Estoy reparando el carro.");
    }
}
