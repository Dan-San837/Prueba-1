import java.util.Date;

public class Visitante extends Usuario {
    public Visitante(String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
    }

    public void pagarPorTiempoUsado(Plaza plaza) {
        if (plaza.getReservaActual() != null) {
            Date inicio = plaza.getReservaActual().getFechaInicio();
            Date fin = new Date();
            long tiempoUsado = (fin.getTime() - inicio.getTime()) / (1000 * 60); // Tiempo en minutos
            double costo = calcularCosto(tiempoUsado);
            System.out.println("Pago realizado por " + tiempoUsado + " minutos. Total: $" + costo);
            plaza.desocupar();
        } else {
            System.out.println("No hay reserva para la plaza " + plaza.getId());
        }
    }

    private double calcularCosto(long tiempoUsado) {
        double tarifaPorMinuto = 0.05; // Ejemplo de tarifa por minuto
        return tiempoUsado * tarifaPorMinuto;
    }
}
