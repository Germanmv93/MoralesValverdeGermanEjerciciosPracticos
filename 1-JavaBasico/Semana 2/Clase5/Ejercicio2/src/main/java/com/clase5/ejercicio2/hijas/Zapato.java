package com.clase5.ejercicio2.hijas;

import com.clase5.ejercicio2.Vestimenta;

/**
 *
 * @author germa
 */
public class Zapato extends Vestimenta {

    private String material;
    private String tipoDeCierre;

    public Zapato() {
    }

    public Zapato(String material, String tipoDeCierre, int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoDeCierre = tipoDeCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoDeCierre() {
        return tipoDeCierre;
    }

    public void setTipoDeCierre(String tipoDeCierre) {
        this.tipoDeCierre = tipoDeCierre;
    }

    @Override
    public String toString() {
        return "Zapato{" + "material=" + material + ", tipoDeCierre=" + tipoDeCierre + '}';
    }

    public void mensaje() {
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }

}
