//Pablo Orantes 25563
//Kevin Moreno 25730

import java.util.Scanner;

public class Trabajador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos del Cajero
        System.out.print("Ingrese el nombre del Cajero: ");
        String nombreCajero = scanner.nextLine();
        System.out.print("Ingrese la edad del Cajero: ");
        int edadCajero = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        Cajero cajero = new Cajero(nombreCajero, edadCajero);

        // Pedir datos del Encargado
        System.out.print("Ingrese el nombre del Encargado: ");
        String nombreEncargado = scanner.nextLine();
        System.out.print("Ingrese la edad del Encargado: ");
        int edadEncargado = scanner.nextInt();
        scanner.nextLine();

        Encargado encargado = new Encargado(nombreEncargado, edadEncargado);

        // Pedir datos del Mecanico
        System.out.print("Ingrese el nombre del Mecanico: ");
        String nombreMecanico = scanner.nextLine();
        System.out.print("Ingrese la edad del Mecanico: ");
        int edadMecanico = scanner.nextInt();
        scanner.nextLine();

        Mecanico mecanico = new Mecanico(nombreMecanico, edadMecanico);

        int opcion;
        do {
            System.out.println("\n MENU DE TRABAJADORES");
            System.out.println("1. Cajero saluda");
            System.out.println("2. Cajero cobra");
            System.out.println("3. Encargado saluda");
            System.out.println("4. Encargado revisa trabajo");
            System.out.println("5. Presentacion del mecanico");
            System.out.println("6. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cajero.saludar();
                    break;
                case 2:
                    cajero.cobrar();
                    break;
                case 3:
                    encargado.saludar();
                    break;
                case 4:
                    encargado.revisarTrabajo();
                    break;
                case 5:
                    mecanico.mostrarDatos();
                    break;
                case 6:
                    System.out.println("Gracias, feliz tarde");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}


