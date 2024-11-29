public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Av. Principal 123");
        Piso piso1 = new Piso(1);
        Plaza plaza1 = new Plaza("A1");

        parqueadero.addPiso(piso1);
        piso1.addPlaza(plaza1);

        ClienteRegular clienteRegular = new ClienteRegular("Juan", "Perez", "123456789", "Tarjeta de Crédito", true);
        Visitante visitante = new Visitante("Ana", "Garcia", "987654321");

        SistemaDeReservas sistemaDeReservas = new SistemaDeReservas();
        sistemaDeReservas.realizarReserva(clienteRegular, plaza1);

        Cajero cajero = new Cajero("001", "Pedro", "Lopez");
        cajero.cobrar(clienteRegular, plaza1);

        Supervisor supervisor = new Supervisor("002", "Maria", "Gomez");
        supervisor.gestionarOperaciones();

        visitante.pagarPorTiempoUsado(plaza1);
    }
}
