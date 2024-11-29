import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String direccion;
    private List<Piso> pisos;

    public Parqueadero(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new ArrayList<>();
    }

    public List<Piso> getPisos() {
        return pisos;
    }

    public void addPiso(Piso piso) {
        pisos.add(piso);
    }
}
