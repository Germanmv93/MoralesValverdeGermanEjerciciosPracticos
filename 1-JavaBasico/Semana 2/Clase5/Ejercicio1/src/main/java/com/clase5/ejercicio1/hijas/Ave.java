
package com.clase5.ejercicio1.hijas;

import com.clase5.ejercicio1.Animal;

/**
 *
 * @author germa
 */
public class Ave extends Animal {

    private int envergaduraDeAlas;
    private String tipoDeVuelo;
    private String colorDelPlumaje;
    private String TipoDePico;

    public Ave() {
    }

    public Ave(int envergaduraDeAlas, String tipoDeVuelo, String colorDelPlumaje, String TipoDePico, int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.envergaduraDeAlas = envergaduraDeAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorDelPlumaje = colorDelPlumaje;
        this.TipoDePico = TipoDePico;
    }

    public int getEnvergaduraDeAlas() {
        return envergaduraDeAlas;
    }

    public void setEnvergaduraDeAlas(int envergaduraDeAlas) {
        this.envergaduraDeAlas = envergaduraDeAlas;
    }

    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public String getColorDelPlumaje() {
        return colorDelPlumaje;
    }

    public void setColorDelPlumaje(String colorDelPlumaje) {
        this.colorDelPlumaje = colorDelPlumaje;
    }

    public String getTipoDePico() {
        return TipoDePico;
    }

    public void setTipoDePico(String TipoDePico) {
        this.TipoDePico = TipoDePico;
    }

    @Override
    public String toString() {
        return "Ave{" + "envergaduraDeAlas=" + envergaduraDeAlas + ", tipoDeVuelo=" + tipoDeVuelo + ", colorDelPlumaje=" + colorDelPlumaje + ", TipoDePico=" + TipoDePico + '}';
    }

    public static void saludar() {
        System.out.println("Hola, soy un ave.");
    }
}
