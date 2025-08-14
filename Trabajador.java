public class Trabajador {
    private String nombre;
    private int edad;
    private String puesto;
    private double salario;
    private String horario;

    public Trabajador(String nombre, int edad, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String resumen() {
        return nombre + " (" + puesto + ", " + edad + " años)"+ "\nSalario: Q" + salario + "\nHorario: " + horario;
    }

    public void setEdad(int edad2) {
        throw new UnsupportedOperationException("Unimplemented method 'setEdad'");
    }

    public void setNombre(String nombre2) {
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }
}
}



