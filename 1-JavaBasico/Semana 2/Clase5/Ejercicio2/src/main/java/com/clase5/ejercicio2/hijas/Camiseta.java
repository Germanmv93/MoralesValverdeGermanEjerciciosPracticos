package com.clase5.ejercicio2.hijas;

import com.clase5.ejercicio2.Vestimenta;

/**
 *
 * @author germa
 */
public class Camiseta extends Vestimenta {

    private String manga;
    private String cuello;

    public Camiseta() {
    }

    public Camiseta(String manga, String cuello, int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    @Override
    public String toString() {
        return "Camiseta{" + "manga=" + manga + ", cuello=" + cuello + '}';
    }

    public void mensaje() {
        System.out.println("Esta camiseta es de marca: " + getManga());
    }

}
