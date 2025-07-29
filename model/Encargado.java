//Pablo Orantes 25563
//Kevin Moreno 25730


public class Encargado {
    private String nombre;
    private int edad;

    public Encargado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, soy el encargado " + nombre + " y tengo " + edad + " años.");
    }

    public void revisarTrabajo() {
        System.out.println(nombre + " está revisando el trabajo.");
    }
}
