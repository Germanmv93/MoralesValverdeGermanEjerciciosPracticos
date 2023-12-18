package com.Ejercicio2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese los datos de la persona numero: " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            sc.nextLine();
            System.out.print("Direccion: ");
            String direccion = sc.nextLine();

            System.out.print("Telefono: ");
            String telefono = sc.nextLine();

            personas[i] = new Persona(id, nombre, edad, direccion, telefono);
        }

        System.out.println("\nEl nombre y la edad de las personas introducidas son: ");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }

        System.out.println("\nEl nombre de las dos persona antes de cambiarle el nombre son: ");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + personas[0].getNombre());
            System.out.println("Nombre: " + personas[1].getNombre());
            break;
        }

        personas[0].setNombre("Jesus");
        personas[1].setNombre("Miguel");

        System.out.println("\nDespues de modificar el nombre de las dos primeras personas quedaria asi: ");

        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
        }




        System.out.println("\nMuestra solo las personas que son mayores de 30 años: ");
        for (Persona persona : personas){
            if (persona.getEdad()>30)
                System.out.println("Nombre: "+ persona.getNombre());
        }

    }
}