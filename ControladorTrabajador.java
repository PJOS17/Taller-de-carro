public class ControladorTrabajador {
    private Trabajador cajero;
    private Trabajador encargado;
    private Trabajador mecanico;
    private VistaTrabajador vista;

    public ControladorTrabajador(VistaTrabajador vista) {
        this.vista = vista;
        focoTrabajadores();
    }

    private void focoTrabajadores() {
        String nombreCajero = vista.pedirTexto("Nombre del Cajero:");
        int edadCajero = vista.pedirEntero("Edad del Cajero:");
        cajero = new Trabajador(nombreCajero, edadCajero, "Cajero");
        cajero.setSalario(2000);
        cajero.setHorario("9am - 5pm");

        String nombreEncargado = vista.pedirTexto("Nombre del Encargado:");
        int edadEncargado = vista.pedirEntero("Edad del Encargado:");
        encargado = new Trabajador(nombreEncargado, edadEncargado, "Encargado");
        encargado.setSalario(3000);
        encargado.setHorario("10am - 7pm");

        String nombreMecanico = vista.pedirTexto("Nombre del Mecánico:");
        int edadMecanico = vista.pedirEntero("Edad del Mecánico:");
        mecanico = new Trabajador(nombreMecanico, edadMecanico, "Mecánico");
        mecanico.setSalario(2500);
        mecanico.setHorario("8am - 4pm");
    }

    public Trabajador getCajero() {
        return cajero;
    }

    public Trabajador getEncargado() {
        return encargado;
    }

    public Trabajador getMecanico() {
        return mecanico;
    }
}
