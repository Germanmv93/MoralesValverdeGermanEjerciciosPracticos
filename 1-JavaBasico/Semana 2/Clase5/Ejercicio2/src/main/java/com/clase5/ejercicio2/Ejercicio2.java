/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.clase5.ejercicio2;

import com.clase5.ejercicio2.hijas.Camiseta;
import com.clase5.ejercicio2.hijas.Pantalon;
import com.clase5.ejercicio2.hijas.Sombrero;
import com.clase5.ejercicio2.hijas.Zapato;

/**
 *
 * @author germa
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Vestimenta vector[] = new Vestimenta[9];

        vector[0] = new Zapato("cuero", "velcro", 0, "zapato1", 50, "nike", "grande", "azul");
        vector[1] = new Zapato("plastico", "cremallera", 1, "zapato2", 26.36, "adidas", "mediana", "blanco");
        vector[2] = new Zapato("cuero sintetico", "cordones", 2, "zapato3", 35, "puma", "pequeña", "negro");
        vector[3] = new Pantalon("pitillo", "algodon", 0, "pantalon1", 10.20, "furor", "M", "rosa");
        vector[4] = new Pantalon("rectos", "pana", 1, "pantalon2", 42.50, "yale", "L", "azul");
        vector[5] = new Pantalon("cargo", "batista", 2, "pantalon3", 15, "contempo", "XL", "blanco");
        vector[6] = new Camiseta("larga", "mao", 0, "pantalon1", 23, "adidas", "XXL", "rojo");
        vector[7] = new Camiseta("corta", "italiano", 1, "pantalon2", 28, "puma", "S", "verde");
        vector[8] = new Sombrero("copaRedonda", "mediano", 0, "sombrero1", 68, "barascon", "L", "negro");

        for (int i = 0; i < vector.length; i++) {
            vector[i].mensaje();
        }

    }
}
