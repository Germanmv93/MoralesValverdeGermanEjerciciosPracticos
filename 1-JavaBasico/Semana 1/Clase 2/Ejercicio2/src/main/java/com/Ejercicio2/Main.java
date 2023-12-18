package com.Ejercicio2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalCompra = 0;

        System.out.println("¡Bienvenido a supermecardos Morales!");
        System.out.println("Introduce el precio de tu primer producto o introduce un valor negativo o un 0 para no introducir mas precios.");

        while (true) {
            System.out.print("Precio del producto: ");
            double precioDelProducto = sc.nextDouble();
//            System.out.println("Lleva un total de: " + (totalCompra += precioDelProducto) + "€");

            if (precioDelProducto <= 0) {
                break;
            } else {
                totalCompra+=precioDelProducto;
                System.out.println("Llevas un total de: " + totalCompra + "€");
            }
        }

        System.out.println("El total de su compra es: " + totalCompra + "€");
        System.out.println("Gracias por visitar supermercados Morales.");

    }

}