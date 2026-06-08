import java.util.List;

public interface SpotifiArbol {
    void insertarCancion(int id);
    void eliminarCancion(int id);
    String buscarCancionXNombre(String nombre);
}
