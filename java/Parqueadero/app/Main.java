/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.app;

import parqueadero.modelo.Parqueadero;

public class Main {
    public static void main(String[] args) {
        Parqueadero centro = new Parqueadero("Centro", 2);
        Parqueadero norte = new Parqueadero("Norte", 3);

        centro.ingresar("ABC123");
        centro.ingresar("ABC123");
        centro.ingresar("XYZ789");
        centro.ingresar("JKL456");

        System.out.println(centro.salir("ABC123"));

        centro.ingresar("JKL456");
        norte.ingresar("MNO321");

        System.out.println(centro.puestosLibres());
        System.out.println(norte.puestosLibres());
        System.out.println(Parqueadero.getIngresosTotales());
    }
}
