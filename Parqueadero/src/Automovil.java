public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String matricula, String modelo, String color, int numeroPuertas) {
        super(matricula, modelo, color);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
