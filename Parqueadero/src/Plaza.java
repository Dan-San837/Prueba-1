public class Plaza {
    private String id;
    private boolean estaOcupada;
    private Reserva reservaActual;

    public Plaza(String id) {
        this.id = id;
        this.estaOcupada = false;
        this.reservaActual = null;
    }

    public String getId() {
        return id;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public Reserva getReservaActual() {
        return reservaActual;
    }

    public void ocupar(Reserva reserva) {
        this.estaOcupada = true;
        this.reservaActual = reserva;
    }

    public void desocupar() {
        this.estaOcupada = false;
        this.reservaActual = null;
    }
}
