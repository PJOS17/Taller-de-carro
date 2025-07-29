//Pablo Orantes 25563
//Kevin Moreno 25730


public class LLantas {
    private String marca;
    private int tamano;

    public LLantas(String marca, int tamano) {
        this.marca = marca;
        this.tamano = tamano;
    }

    public void mostrarInformacion() {
        System.out.println("Marca de llantas: " + marca + ", Tamaño: " + tamano + " cm");
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}

