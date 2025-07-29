public class Piezas {
    private String tipo;
    private int cantidad;

    public Piezas(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo de pieza: " + tipo + ", Cantidad: " + cantidad);
    }

    public void verificarStock() {
        if (cantidad > 0) {
            System.out.println("Hay existencias de " + tipo + ".");
        } else {
            System.out.println("No hay existencias de " + tipo + ".");
        }
    }

    public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
    }


    
}


