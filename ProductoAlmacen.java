public class ProductoAlmacen {
    public static void main(String[] args) {
        ProductoVista vista = new ProductoVista();
        ProductoControlador controlador = new ProductoControlador(vista);
        controlador.ejecutarMenu();
    }
}

