package com.clase5.ejercicio2.hijas;

import com.clase5.ejercicio2.Vestimenta;

/**
 *
 * @author germa
 */
public class Pantalon extends Vestimenta {

    private String estilo;
    private String tipoDeTejido;

    public Pantalon() {
    }

    public Pantalon(String estilo, String tipoDeTejido, int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoDeTejido = tipoDeTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoDeTejido() {
        return tipoDeTejido;
    }

    public void setTipoDeTejido(String tipoDeTejido) {
        this.tipoDeTejido = tipoDeTejido;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "estilo=" + estilo + ", tipoDeTejido=" + tipoDeTejido + '}';
    }

    public void mensaje() {
        System.out.println("Estos pantalones son del estilo: " + getEstilo());
    }

}
