//Pablo Orantes 25563
//Kevin Moreno 25730
 

public class Cajero {
    private String nombre;
    private int edad;

    public Cajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, soy el cajero " + nombre + " y tengo " + edad + " años.");
    }

    public void cobrar() {
        System.out.println(nombre + " está cobrando al cliente.");
    }
}



