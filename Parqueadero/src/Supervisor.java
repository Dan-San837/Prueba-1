public class Supervisor extends Empleado {
    public Supervisor(String idEmpleado, String nombre, String apellido) {
        super(idEmpleado, nombre, apellido);
    }

    public void gestionarOperaciones() {
        System.out.println("Gestionando operaciones del parqueadero...");


    }
}
