import java.util.Scanner;

public class VistaTrabajador {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        VistaTrabajador vista = new VistaTrabajador();
        ControladorTrabajador controlador = new ControladorTrabajador(vista);
        vista.mostrarMenu(controlador);
    }

    public String pedirTexto(String mensaje) {
        System.out.print(mensaje + " ");
        return scanner.nextLine();
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje + " ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        return valor;
    }

    public void mostrarMenu(ControladorTrabajador controlador) {
        int opcion;
        do {
            System.out.println("\n MENÚ DE TRABAJADORES ");
            System.out.println("1. Ver resumen del Cajero");
            System.out.println("2. Ver resumen del Encargado");
            System.out.println("3. Ver resumen del Mecánico");
            System.out.println("4. Ver salario del Cajero");
            System.out.println("5. Ver salario del Encargado");
            System.out.println("6. Ver salario del Mecánico");
            System.out.println("7. Ver horario del Cajero");
            System.out.println("8. Ver horario del Encargado");
            System.out.println("9. Ver horario del Mecánico");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = pedirEntero("");

            switch (opcion) {
                case 1:
                    System.out.println(controlador.getCajero().resumen());
                    break;
                case 2:
                    System.out.println(controlador.getEncargado().resumen());
                    break;
                case 3:
                    System.out.println(controlador.getMecanico().resumen());
                    break;
                case 4:
                    System.out.println("Salario del Cajero: Q" + controlador.getCajero().getSalario());
                    break;
                case 5:
                    System.out.println("Salario del Encargado: Q" + controlador.getEncargado().getSalario());
                    break;
                case 6:
                    System.out.println("Salario del Mecánico: Q" + controlador.getMecanico().getSalario());
                    break;
                case 7:
                    System.out.println("Horario del Cajero: " + controlador.getCajero().getHorario());
                    break;
                case 8:
                    System.out.println("Horario del Encargado: " + controlador.getEncargado().getHorario());
                    break;
                case 9:
                    System.out.println("Horario del Mecánico: " + controlador.getMecanico().getHorario());
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 10);
    }
}
