//Pablo Orantes 25563
//Kevin Moreno 25730

public class Problema {
    private String problema;
    private String marca;

    public Problema(String problema, String marca) {
        this.problema = problema;
        this.marca = marca;
    }
    
    public Problema () {
        problema = "Golpe el costado";
        marca = "Ford";
    }
    public String getProblem() {
        return problema;
    }

    public String getMarca() {
        return marca;
    }


    
}
