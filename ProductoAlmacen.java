//Pablo Orantes 25563
//Kevin Moreno 25730

import java.util.Scanner;

public class ProductoAlmacen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos para Piezas
        System.out.print("Ingrese el tipo de pieza: ");
        String tipoPieza = scanner.nextLine();
        System.out.print("Ingrese la cantidad de piezas: ");
        int cantidadPieza = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        Piezas piezas = new Piezas(tipoPieza, cantidadPieza);

        // Pedir datos para Llantas
        System.out.print("Ingrese la marca de las llantas: ");
        String marcaLLanta = scanner.nextLine();
        System.out.print("Ingrese el tamaño de las llantas (cm): ");
        int tamanoLLanta = scanner.nextInt();
        scanner.nextLine();

        LLantas llantas = new LLantas(marcaLLanta, tamanoLLanta);

        // Pedir datos para Carro
        System.out.print("Ingrese el modelo del carro: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Ingrese el año del carro: ");
        int anioCarro = scanner.nextInt();
        scanner.nextLine();

        Carro carro = new Carro(modeloCarro, anioCarro);

        int opcion;
        do {
            System.out.println("\n=== MENU DE PRODUCTO ALMACEN ===");
            System.out.println("1. Mostrar información de piezas");
            System.out.println("2. Mostrar información de llantas");
            System.out.println("3. Mostrar información de carro");
            System.out.println("4. Verificar stock de piezas");
            System.out.println("5. Ver marca de llantas");
            System.out.println("6. Describir carro");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

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
                    System.out.println("Gracias, feliz tarde");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
