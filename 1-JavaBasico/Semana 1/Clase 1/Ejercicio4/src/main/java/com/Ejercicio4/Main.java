package com.Ejercicio4;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para poder realizar este ejercicio me tendras que proporcionar dos números y con ellos yo realizare la suma, resta, multiplicación y división de ellos");
        System.out.println("Introduce el primer número");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;

        System.out.println("La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicación es:  " + multiplicacion);

        /*
        Si intentamos realizar una división con el num2=0 no nos arrojará un error, pero sí nos dará como resultado infinty.
        Para que esto no ocurra creamos una condición if en la cual indicamos que si para la división el num2 es distinto a 0
         realice la operación y si no (Es decir que si es un 0) pues muestre el mensaje de que no se puede dividir entre 0.
        */

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("La división es: " + division);
        } else {
            System.out.println("No es posible dividir entre 0.");
        }
    }
}