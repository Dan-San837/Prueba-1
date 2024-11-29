public class Bicicleta extends Vehiculo {
    private boolean esElectrica;

    public Bicicleta(String matricula, String modelo, String color, boolean esElectrica) {
        super(matricula, modelo, color);
        this.esElectrica = esElectrica;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }
}
