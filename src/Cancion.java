public class Cancion {
    private String nombre;
    private String artista;
    private String fecha;
    private int duracion;
    private String genero;

    public Cancion(String nombre, String artista, String fecha, int duracion, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.fecha = fecha;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
