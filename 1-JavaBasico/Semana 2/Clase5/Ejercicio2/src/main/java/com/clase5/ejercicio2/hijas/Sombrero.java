package com.clase5.ejercicio2.hijas;

import com.clase5.ejercicio2.Vestimenta;

/**
 *
 * @author germa
 */
public class Sombrero extends Vestimenta {

    private String tipo;
    private String tamaño;

    public Sombrero() {
    }

    public Sombrero(String tipo, String tamaño, int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Sombrero{" + "tipo=" + tipo + ", tama\u00f1o=" + tamaño + '}';
    }

    public void mensaje() {
        System.out.println("Este sombrero es de tipo: " + getTipo());
    }
}
