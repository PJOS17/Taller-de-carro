import java.awt.*;
import javax.swing.*;

public class Graico extends JFrame {
    private ProductoVista vista;
    private ProductoControlador controlador;
    private JTextArea areaInfo;
    private Piezas piezas;
    private LLantas llantas;
    private Carro carro;

    public Graico() {
        vista = new ProductoVista();
        controlador = new ProductoControlador(vista);
        setTitle("Menú de Producto Almacén");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        areaInfo = new JTextArea();
        areaInfo.setEditable(false);
        add(new JScrollPane(areaInfo), BorderLayout.CENTER);


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
            case 1:
                controlador.piezas.mostrarInformacion();
                break;
            case 2:
                controlador.llantas.mostrarInformacion();
                break;
            case 3:
                controlador.carro.mostrarInformacion();
                break;
            case 4:
                controlador.piezas.verificarStock();
                break;
            case 5:
                controlador.llantas.mostrarMarca();
                break;
            case 6:
                controlador.carro.describirCarro();
                break;
            case 7:
                String nuevoModelo = JOptionPane.showInputDialog(this, "Nuevo modelo de carro:");
                if (nuevoModelo != null) controlador.carro.setModelo(nuevoModelo);
                break;
            case 8:
                String cantidadStr = JOptionPane.showInputDialog(this, "Nueva cantidad de piezas:");
                try {
                    int nuevaCantidad = Integer.parseInt(cantidadStr);
                    controlador.piezas.setCantidad(nuevaCantidad);
                } catch (Exception ex) {
                    mostrarMensaje("Cantidad inválida.");
                }
                break;
            case 9:
                String nuevaMarca = JOptionPane.showInputDialog(this, "Nueva marca de llantas:");
                if (nuevaMarca != null) controlador.llantas.setMarca(nuevaMarca);
                break;
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
            new Graico().setVisible(true);
        });
    }
}