/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.modelo;

public class Puesto {
    private int numero;
    private String placa; // null si está libre

    Puesto(int numero) { // sin public: solo se crea dentro del paquete
        this.numero = numero;
        this.placa = null;
    }

    public int getNumero() {
        return numero;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean estaLibre() {
        return placa == null;
    }

    public void ocupar(String placa) {
        this.placa = placa;
    }

    public void liberar() {
        this.placa = null;
    }
}
