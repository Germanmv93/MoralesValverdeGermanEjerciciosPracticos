package com.Ejercicio2;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int edad = 30;
            double altura = 1.79;
            boolean bandera = true;
            String nombre = "German";

        System.out.println("El valor de edad es de: " + edad);
        System.out.println("El valor de altura es de: " + altura);
        System.out.println("El valor de bandera es de: " + bandera);
        System.out.println("El valor de nombre es de: " + nombre);

        System.out.println("¡Hola! mi nombre es " + nombre + " y tengo " + edad+ " años. Mido " + altura + " y todo esto que estoy diciendo es " + bandera);
    }

    /*En los casos en los que no se ponga el tipo correcto de contenido para la variable, primeramente el ide te lanzara un mensaje comentando que la expresion
    utilizada para esa variable no es la correcta. Por ejemplo si en el tipo int ponemos un numero decimal no te ejecutara el programa.
     */

}