package com.Ejercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        ¿Seria mejor realizarlo de esta forma o da igual?
        int diasSemana=7;
        double[] temperaturas = new double[diasSemana]
         */

        double[] temperaturas = new double[7]; //1 semana = 7 dias

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese la temperatura maxima del dia " + (i + 1) + ":");
            temperaturas[i] = sc.nextDouble();
        }

        double sumaTemperaturas = 0;
        for (int i = 0; i < 7; i++) {
            sumaTemperaturas+=temperaturas[i];
        }
        double promedioDeLasTemperaturas= sumaTemperaturas/7; //Aqui podria poner 7 o

        //Simplemente por estetica visual he dejado solo dos decimales
        DecimalFormat formato= new DecimalFormat("#.##");
        String promedioDosDecimales= formato.format(promedioDeLasTemperaturas);


        System.out.println("El promedio de todas las temperaturas es: " + promedioDosDecimales + " grados");

    }
}