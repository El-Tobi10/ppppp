import java.util.ArrayList;
import java.util.List;

public class ImplementarArbol implements SpotifiArbol{
    private ImplementarArbol nodoIzq;
    private ImplementarArbol nodoDer;
    private int valor;
    private List<Cancion> canciones;

    public ImplementarArbol(int valor) {
        this.canciones = new ArrayList<>(); // Inicializamos la lista en el constructor
        this.valor = valor;
        this.nodoDer = null;
        this.nodoIzq = null;
    }

    @Override
    public void insertarCancion(int id) {
        if (id < this.valor){
            if (nodoIzq == null){
                this.nodoIzq = new ImplementarArbol(id);
            }else{
                this.nodoIzq.insertarCancion(id);
            }
        }else {
            if (nodoDer == null){
                this.nodoDer = new ImplementarArbol(id);
            } else{
                this.nodoDer.insertarCancion(id);
            }
        }
    }

    @Override
    public void eliminarCancion(int id) {

    }

    @Override
    public String buscarCancionXNombre(String nombre) {
        return "";
    }
}
