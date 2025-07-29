public class LLantas {
    private String marca;
    private int tamano;

    public LLantas(String marca, int tamano) {
        this.marca = marca;
        this.tamano = tamano;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Tamaño: " + tamano + " cm");
    }

    public void mostrarMarca() {
        System.out.println("Marca de las llantas: " + marca);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}



