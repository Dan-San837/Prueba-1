public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String matricula, String modelo, String color, boolean tieneSidecar) {
        super(matricula, modelo, color);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
}
