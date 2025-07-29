public class ProductoControlador {
    private Piezas piezas;
    private LLantas llantas;
    private Carro carro;
    private ProductoVista vista;

    public ProductoControlador(ProductoVista vista) {
        this.vista = vista;
        inicializarProductos();
    }

    private void inicializarProductos() {
        String tipo = vista.pedirTexto("Ingrese el tipo de pieza: ");
        int cantidad = vista.pedirEntero("Ingrese la cantidad de piezas: ");
        piezas = new Piezas(tipo, cantidad);

        String marca = vista.pedirTexto("Ingrese la marca de las llantas: ");
        int tamano = vista.pedirEntero("Ingrese el tamaño de las llantas (cm): ");
        llantas = new LLantas(marca, tamano);

        String modelo = vista.pedirTexto("Ingrese el modelo del carro: ");
        int anio = vista.pedirEntero("Ingrese el año del carro: ");
        carro = new Carro(modelo, anio);
    }

    public void ejecutarMenu() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();

            switch (opcion) {
                case 1:
                    piezas.mostrarInformacion();
                    break;
                case 2:
                    llantas.mostrarInformacion();
                    break;
                case 3:
                    carro.mostrarInformacion();
                    break;
                case 4:
                    piezas.verificarStock();
                    break;
                case 5:
                    llantas.mostrarMarca();
                    break;
                case 6:
                    carro.describirCarro();
                    break;
                case 7:
                    vista.mostrarMensaje("Gracias, feliz tarde");
                    break;
                case 8:
                    int nuevaCantidad = vista.pedirEntero("Nueva cantidad de piezas: ");
                    piezas.setCantidad(nuevaCantidad);
                    break;
                case 9:
                    String nuevaMarca = vista.pedirTexto("Nueva marca de llantas: ");
                    llantas.setMarca(nuevaMarca);
                    break;
                case 10:
                    String nuevoModelo = vista.pedirTexto("Nuevo modelo de carro: ");
                    carro.setModelo(nuevoModelo);
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        } while (opcion != 7);
    }
}



