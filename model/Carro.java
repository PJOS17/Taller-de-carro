public class Carro {
    private String modelo;
    private int anio;

    public Carro(String modelo, int anio) {
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInformacion() {
        System.out.println("Modelo del carro: " + modelo + ", Año: " + anio);
    }

    public void describirCarro() {
        System.out.println("El carro modelo " + modelo + " del año " + anio + " está listo para entrega.");
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

