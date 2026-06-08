import java.util.ArrayList;
import java.util.List;

public class ImplementarArbol implements SpotifiArbol{

    private List<Cancion> canciones;

    public ImplementarArbol() {
        this.canciones = new ArrayList<>(); // Inicializamos la lista en el constructor
    }

    @Override
    public void insertarCancion(int id) {

    }

    @Override
    public void eliminarCancion(int id) {

    }

    @Override
    public String buscarCancionXNombre(String nombre) {
        return "";
    }
}
