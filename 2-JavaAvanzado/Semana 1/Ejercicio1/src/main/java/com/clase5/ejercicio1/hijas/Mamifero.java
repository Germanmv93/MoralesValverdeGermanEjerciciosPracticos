
package com.clase5.ejercicio1.hijas;

import com.clase5.ejercicio1.Animal;

/**
 *
 * @author germa
 */
public class Mamifero extends Animal{
    private int numeroDePatas;
    private String tipoDeReproduccion;
    private String colorDelPelaje;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(int numeroDePatas, String tipoDeReproduccion, String colorDelPelaje, String habitat, int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.numeroDePatas = numeroDePatas;
        this.tipoDeReproduccion = tipoDeReproduccion;
        this.colorDelPelaje = colorDelPelaje;
        this.habitat = habitat;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getTipoDeReproduccion() {
        return tipoDeReproduccion;
    }

    public void setTipoDeReproduccion(String tipoDeReproduccion) {
        this.tipoDeReproduccion = tipoDeReproduccion;
    }

    public String getColorDelPelaje() {
        return colorDelPelaje;
    }

    public void setColorDelPelaje(String colorDelPelaje) {
        this.colorDelPelaje = colorDelPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "numeroDePatas=" + numeroDePatas + ", tipoDeReproduccion=" + tipoDeReproduccion + ", colorDelPelaje=" + colorDelPelaje + ", habitat=" + habitat + '}';
    }
    
    public static void saludar(){
        System.out.println("Hola, soy un mamifero.");
    }
              
}
