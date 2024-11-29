import java.util.Date;

public class ClienteRegular extends Usuario implements Cliente {
    private String metodoPago;
    private boolean suscripcionActiva;

    public ClienteRegular(String nombre, String apellido, String telefono, String metodoPago, boolean suscripcionActiva) {
        super(nombre, apellido, telefono);
        this.metodoPago = metodoPago;
        this.suscripcionActiva = suscripcionActiva;
    }

    @Override
    public void realizarReserva(Plaza plaza) {
        if (!plaza.isEstaOcupada()) {
            Reserva reserva = new Reserva(new Date(), null);
            plaza.ocupar(reserva);
            System.out.println("Reserva realizada para la plaza: " + plaza.getId());
        } else {
            System.out.println("La plaza " + plaza.getId() + " ya está ocupada.");
        }
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public boolean isSuscripcionActiva() {
        return suscripcionActiva;
    }
}
