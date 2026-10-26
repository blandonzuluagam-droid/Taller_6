/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.app;

import musica.modelo.Cancion;
import musica.modelo.Playlist;

public class Reproductor {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Lluvia en Manizales", "Nevado", 200);
        Cancion c2 = new Cancion("Bajo el guadual", "Café Trío", 245);
        Cancion c3 = new Cancion("Noche en Chipre", "Nevado", 185);

        Playlist favoritas = new Playlist("Favoritas");
        favoritas.agregar(c1);
        favoritas.agregar(c2);
        favoritas.agregar(c3);

        System.out.println(favoritas.agregar(c1)); // intento repetido

        favoritas.mostrar();
        System.out.println(favoritas.duracionTotal());
    }
}
