package musica.modelo;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracion; // en segundos
    private static int totalCanciones = 0;

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        totalCanciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public static int getTotalCanciones() {
        return totalCanciones;
    }
}