/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.modelo;

import java.util.ArrayList;

public class Playlist {
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public boolean agregar(Cancion cancion) {
        if (cancion == null || canciones.contains(cancion)) {
            return false;
        }
        canciones.add(cancion);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");
        for (int i = 0; i < canciones.size(); i++) {
            Cancion c = canciones.get(i);
            System.out.println((i + 1) + ". " + c.getTitulo() + " - "
                    + c.getArtista() + " (" + c.getDuracion() + " s)");
        }
    }

    public int duracionTotal() {
        int total = 0;
        for (Cancion c : canciones) {
            total += c.getDuracion();
        }
        return total;
    }
}
