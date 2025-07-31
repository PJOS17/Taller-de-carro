import java.util.Scanner;

public class ProductoVista {
    
    private Scanner scanner = new Scanner(System.in);

    public String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        return valor;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenu() {
        System.out.println("\n=== MENU DE PRODUCTO ALMACEN ===");
        System.out.println("1. Mostrar información de piezas");
        System.out.println("2. Mostrar información de llantas");
        System.out.println("3. Mostrar información de carro");
        System.out.println("4. Verificar stock de piezas");
        System.out.println("5. Ver marca de llantas");
        System.out.println("6. Describir carro");
        System.out.println("7. Cambiar modelo de carro ");
        System.out.println("8. Actualizar cantidad de piezas");
        System.out.println("9. Cambiar marca de llantas");
        System.out.println("10.Salir");
    }

    public int pedirOpcion() {
        return pedirEntero("Elija una opción: ");
    }
    public static void main(String[] args) {
        ProductoVista vista = new ProductoVista();
        ProductoControlador controlador = new ProductoControlador(vista);
        controlador.ejecutarMenu();
    }
}

