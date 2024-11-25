import java.util.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Crear plazas de parqueo
        Plaza plaza1 = new Plaza("A1", "Mediana", Estado.DESOCUPADO);
        Plaza plaza2 = new Plaza("A2", "Grande", Estado.OCUPADO);
        List<Plaza> plazas = new ArrayList<>();
        plazas.add(plaza1);
        plazas.add(plaza2);

        // Crear pisos
        Piso piso1 = new Piso(1, plazas);
        List<Piso> pisos = new ArrayList<>();
        pisos.add(piso1);

        // Crear parqueadero
        Parqueadero parqueadero = new Parqueadero(
                "Parqueadero Central", "Grande", 100, "Centro de la ciudad", 50, true, pisos
        );

        // Crear vehículos
        Automovil auto = new Automovil("ABC123", "Grande", "Toyota", "Rojo", 4);
        Moto moto = new Moto("XYZ789", "Mediana", "Yamaha", "Negra", 600);
        Bicicleta bici = new Bicicleta("BCD456", "Pequeña", "Giant", "Azul", "Montaña");

        // Registrar ingreso de vehículos
        parqueadero.registrarIngresoVehiculo(auto);
        parqueadero.registrarIngresoVehiculo(moto);

        // Registrar salida de un vehículo
        parqueadero.registrarSalidaVehiculo(auto);

        // Crear cliente regular y visitante
        Regular clienteRegular = new Regular("Juan", "Pérez", 30, true, 1.75f, "123456789", 123456, true);
        Visitante visitante = new Visitante("Ana", "Gómez", 25, false, 1.65f, "987654321", 654321, 2.5f);

        // Adquirir servicios
        clienteRegular.adquirirServicios();
        visitante.adquirirServicios();

        // Realizar pago de suscripción
        Efectivo efectivo = new Efectivo("Pago en efectivo");
        clienteRegular.pagoSuscripcion(efectivo, null);

        // Realizar pago por tiempo usado
        visitante.pagoTiempoUsado();
    }
}
