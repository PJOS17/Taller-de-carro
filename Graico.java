import java.awt.*;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.*;

public class Grafico extends JFrame {
    // Método auxiliar para pedir enteros por GUI
    private int pedirEnteroGUI(String mensaje) {
        while (true) {
            String input = JOptionPane.showInputDialog(this, mensaje);
            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido.");
            }
        }
    }
    private JTextArea areaInfo;

    // Arreglos para almacenar los datos
    private Piezas[] piezasArr;
    private LLantas[] llantasArr;
    private Carro[] carrosArr;

    public Grafico() {
        setTitle("Menú de Producto Taller de Carro");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        areaInfo = new JTextArea();
        areaInfo.setEditable(false);
        add(new JScrollPane(areaInfo), BorderLayout.CENTER);

        // Redirigir System.out a areaInfo
        PrintStream printStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                areaInfo.append(String.valueOf((char) b));
            }
        });
        System.setOut(printStream);

        // Pedir datos por GUI y llenar arreglos
        int numPiezas = pedirEnteroGUI("¿Cuántas piezas desea ingresar?");
        piezasArr = new Piezas[numPiezas];
        for (int i = 0; i < numPiezas; i++) {
            String nombre = JOptionPane.showInputDialog(this, "Nombre de la pieza " + (i+1) + ":");
            int cantidad = pedirEnteroGUI("Cantidad de la pieza " + (i+1) + ":");
            piezasArr[i] = new Piezas(nombre, cantidad);
        }

        int numLlantas = pedirEnteroGUI("¿Cuántas llantas desea ingresar?");
        llantasArr = new LLantas[numLlantas];
        for (int i = 0; i < numLlantas; i++) {
            String marca = JOptionPane.showInputDialog(this, "Marca de la llanta " + (i+1) + ":");
            int tamano = pedirEnteroGUI("Tamaño de la llanta " + (i+1) + " (en cm):");
            llantasArr[i] = new LLantas(marca, tamano);
        }

        int numCarros = pedirEnteroGUI("¿Cuántos carros desea ingresar?");
        carrosArr = new Carro[numCarros];
        for (int i = 0; i < numCarros; i++) {
            String modelo = JOptionPane.showInputDialog(this, "Modelo del carro " + (i+1) + ":");
            int anio = pedirEnteroGUI("Año del carro " + (i+1) + ":");
            carrosArr[i] = new Carro(modelo, anio);
        }

        JPanel panelBotones = new JPanel(new GridLayout(5, 2, 5, 5));
        String[] opciones = {
            "Mostrar información de piezas",
            "Mostrar información de llantas",
            "Mostrar información de carro",
            "Verificar stock de piezas",
            "Ver marca de llantas",
            "Describir carro",
            "Cambiar modelo de carro",
            "Actualizar cantidad de piezas",
            "Cambiar marca de llantas",
            "Salir"
        };
        for (int i = 0; i < opciones.length; i++) {
            int opcion = i + 1;
            JButton btn = new JButton(opciones[i]);
            btn.addActionListener(e -> ejecutarOpcion(opcion));
            panelBotones.add(btn);
        }
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1: // Mostrar información de piezas
                for (Piezas pieza : piezasArr) {
                    pieza.mostrarInformacion();
                }
                break;
            case 2: // Mostrar información de llantas
                for (LLantas llanta : llantasArr) {
                    llanta.mostrarInformacion();
                }
                break;
            case 3: // Mostrar información de carro
                for (Carro carro : carrosArr) {
                    carro.mostrarInformacion();
                }
                break;
            case 4: // Verificar stock de piezas
                for (Piezas pieza : piezasArr) {
                    pieza.verificarStock();
                }
                break;
            case 5: // Ver marca de llantas
                for (LLantas llanta : llantasArr) {
                    llanta.mostrarMarca();
                }
                break;
            case 6: // Describir carro
                for (Carro carro : carrosArr) {
                    carro.describirCarro();
                }
                break;
            case 7: { // Cambiar modelo de carro
                int idx = pedirEnteroGUI("¿Qué carro desea modificar? (1 - " + carrosArr.length + ")") - 1;
                if (idx >= 0 && idx < carrosArr.length) {
                    String nuevoModelo = JOptionPane.showInputDialog(this, "Nuevo modelo de carro:");
                    if (nuevoModelo != null && !nuevoModelo.isEmpty()) {
                        carrosArr[idx].setModelo(nuevoModelo);
                        mostrarMensaje("Modelo de carro actualizado a: " + nuevoModelo);
                    } else {
                        mostrarMensaje("Modelo no modificado.");
                    }
                } else {
                    mostrarMensaje("Índice de carro no válido.");
                }
                break;
            }
            case 8: { // Actualizar cantidad de piezas
                int idx = pedirEnteroGUI("¿Qué pieza desea modificar? (1 - " + piezasArr.length + ")") - 1;
                if (idx >= 0 && idx < piezasArr.length) {
                    int nuevaCantidad = pedirEnteroGUI("Nueva cantidad de piezas:");
                    piezasArr[idx].setCantidad(nuevaCantidad);
                    mostrarMensaje("Cantidad de piezas actualizada a: " + nuevaCantidad);
                } else {
                    mostrarMensaje("Índice de pieza no válido.");
                }
                break;
            }
            case 9: { // Cambiar marca de llantas
                int idx = pedirEnteroGUI("¿Qué llanta desea modificar? (1 - " + llantasArr.length + ")") - 1;
                if (idx >= 0 && idx < llantasArr.length) {
                    String nuevaMarca = JOptionPane.showInputDialog(this, "Nueva marca de llantas:");
                    if (nuevaMarca != null && !nuevaMarca.isEmpty()) {
                        llantasArr[idx].setMarca(nuevaMarca);
                        mostrarMensaje("Marca de llantas actualizada a: " + nuevaMarca);
                    } else {
                        mostrarMensaje("Marca no modificada.");
                    }
                } else {
                    mostrarMensaje("Índice de llanta no válido.");
                }
                break;
            }
            case 10:
                mostrarMensaje("Gracias, feliz tarde");
                System.exit(0);
                break;
            default:
                mostrarMensaje("Opción no válida.");
                break;
        }
    }

    private void mostrarMensaje(String mensaje) {
        areaInfo.append(mensaje + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Grafico().setVisible(true);
        });
    }
}
