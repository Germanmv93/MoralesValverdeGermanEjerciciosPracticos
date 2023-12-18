package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Porfavor ingrese la altura del triangulo : ");
            double altura = sc.nextDouble();
            System.out.println("¡Bien! Ahora ingrese la base del triangulo:");
            double base = sc.nextDouble();

            double area = (base * altura) / 2;

            System.out.println("Con los datos ingresados puedo calcularte que el area del triangulo es: " + area);

    }
}