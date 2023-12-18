package com.Ejercicio1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a una de Cal y una de Arena Festival");

        System.out.println("Esperamos que tengas tu entrada a mano, lamentablemente tienes que ser mayor de edad para poder acceder al festival");

        System.out.println("Por favor ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {

            System.out.println("Ya que tienes 18 años o mas puedes pasar, disfruta.");

        } else {

            System.out.println("Lo siento, no tienes 18 años. Ni con la autorizacion de tus padres podrias entrar a este festival.");

        }
    }
}