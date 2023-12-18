package com.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Television", "Haier", 15.8, "negro");
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "Lavadora", "Bosch", 30.8, "blanco");
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "Frigorifico", "LG", 67.2, "rojo");
        Electrodomestico electrodomestico4 = new Electrodomestico();

        System.out.println("La marca, modelo y consumo del primer electrodoméstico es: " + electrodomestico1.getMarca() + " " + electrodomestico1.getModelo() + " " + electrodomestico1.getConsumo());

        System.out.println("La marca, modelo y consumo del segundo electrodoméstico es: " + electrodomestico2.getMarca() + " " + electrodomestico1.getModelo() + " " + electrodomestico1.getConsumo());

        System.out.println("La marca, modelo y consumo del tercer electrodoméstico es: " + electrodomestico3.getMarca() + " " + electrodomestico1.getModelo() + " " + electrodomestico1.getConsumo());

        System.out.println("La marca del cuarto electodoméstico es: " + electrodomestico4.getMarca()); //En esta caso ya que el electroméstico 4 no tiene ningun parámetro da el valor null para la marca.
    }
}