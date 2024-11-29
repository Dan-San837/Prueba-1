import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int numero;
    private List<Plaza> plazas;

    public Piso(int numero) {
        this.numero = numero;
        this.plazas = new ArrayList<>();
    }

    public List<Plaza> getPlazas() {
        return plazas;
    }

    public void addPlaza(Plaza plaza) {
        plazas.add(plaza);
    }
}
