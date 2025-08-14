import javax.swing.*;
import java.util.ArrayList;

public class GraficaTrabajador {
    
    private int[] numeros = new int[10];
    private boolean[] estados = new boolean[5];
    private double[] precios = new double[8];

    private Mecanico[][] mecanicos = new Mecanico[3][3];

    private ArrayList<Trabajador> clientes = new ArrayList<>();

    private Trabajador[] trabajadores = new Trabajador[3];

    public void mostrarInterfaz() {
        JFrame frame = new JFrame("Taller de Carro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        String[] roles = {"Cajero", "Encargado", "Mecánico"};
        for (int i = 0; i < trabajadores.length; i++) {
            String nombre = JOptionPane.showInputDialog(frame, "Nombre del " + roles[i] + ":");
            String edadStr = JOptionPane.showInputDialog(frame, "Edad del " + roles[i] + ":");
            int edad = Integer.parseInt(edadStr);
            String salarioStr = JOptionPane.showInputDialog(frame, "Salario del " + roles[i] + ":");
            double salario = Double.parseDouble(salarioStr);
            String horario = JOptionPane.showInputDialog(frame, "Horario del " + roles[i] + ":");
            trabajadores[i] = new Trabajador(nombre, edad, roles[i]);
            trabajadores[i].setSalario(salario);
            trabajadores[i].setHorario(horario);
        }
        StringBuilder resumen = new StringBuilder("<html>");
        for (Trabajador t : trabajadores) {
            resumen.append(t.resumen().replace("\n", "<br>")).append("<br><br>");
        }
        resumen.append("</html>");

        JLabel label = new JLabel(resumen.toString(), SwingConstants.CENTER);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GraficaTrabajador().mostrarInterfaz();
    }
}
