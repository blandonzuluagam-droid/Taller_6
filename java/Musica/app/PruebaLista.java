/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.app;

import java.util.ArrayList;

public class PruebaLista {
    public static void main(String[] args) {
        // 1. Crear la lista y agregar géneros
        ArrayList<String> generos = new ArrayList<>();
        generos.add("Rock");
        generos.add("Salsa");
        generos.add("Vallenato");
        System.out.println(generos.size());   // 3
        System.out.println(generos.get(1));   // Salsa

        // 2. Reemplazar Salsa por Merengue e insertar Pop al inicio
        generos.set(1, "Merengue");
        generos.add(0, "Pop");
        System.out.println(generos);          // [Pop, Rock, Merengue, Vallenato]

        // 3. Eliminar Rock y consultar
        generos.remove("Rock");
        System.out.println(generos.contains("Rock"));      // false
        System.out.println(generos.indexOf("Vallenato"));  // 2

        // 4. Recorrer con for-each en mayúsculas
        for (String g : generos) {
            System.out.println(g.toUpperCase());
        }
    }
}
