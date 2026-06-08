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
        if (sonAmigos(usuario1, usuario2)) return;
        usuario1.amigos.add(usuario2);
        usuario2.amigos.add(usuario1);
    }

    public boolean sonAmigos(Usuario usuario1, Usuario usuario2){
        if (usuario1.amigos.isEmpty() || usuario2.amigos.isEmpty()) return false;
        for (Usuario user : usuario1.amigos){
            if (user == usuario2) return true;
        }
        return false;
    }
}
