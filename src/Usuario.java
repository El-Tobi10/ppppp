import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Usuario {
    private static int idUser = 1;
    private String nombre;
    private List<Playlist> biblioteca;
    private HashSet<Cancion> historial;
    private List<Usuario> amigos;

    public Usuario(String nombre) {
        this.idUser = idUser++;
        this.nombre = nombre;
        this.biblioteca = new ArrayList<>();
        this.historial = new HashSet<>();
        this.amigos = new ArrayList<>();
    }

    public void agregarAmigo(Usuario usuario1, Usuario usuario2){
        if (sonAmigos(usuario2)) return;
        usuario1.amigos.add(usuario2);
        usuario2.amigos.add(usuario1);
    }

    public boolean sonAmigos(Usuario usuario1){
        if (amigos.isEmpty()) return false;
        for (Usuario user : amigos){
            if (user == usuario1) return true;
        }
        return false;
    }
    /// grafo no ponderado (por que es unidireccional, al uno aceptar solicitud ya son amigos (mas facebook que instagram))
}
