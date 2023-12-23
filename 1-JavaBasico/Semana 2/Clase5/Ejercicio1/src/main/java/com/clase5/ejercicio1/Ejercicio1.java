
package com.clase5.ejercicio1;

import com.clase5.ejercicio1.hijas.Ave;
import com.clase5.ejercicio1.hijas.Mamifero;
import com.clase5.ejercicio1.hijas.Reptil;

public class Ejercicio1 {

    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero(0, "sexualmente", "negro", "selva", 0, "Leon", 28, "fina", "carnivoro");
        Ave ave = new Ave(330, "hiper-eficiente", "negro y blanco", "corneo", 0, "condor", 15, "plumas", "carroñero");
        Reptil reptil = new Reptil(40, "seca y resistente", "sin veneno", "bosques", 0, "iguana", 9, "escamas", "herbivora");

        Mamifero.saludar();
        Ave.saludar();
        Reptil.saludar();

        /* D)
        No se podria crear un objeto de tipo animal y asignarle al mamifero ya que nos daria un error, si se podria alreves o crear un objeto animal y asignarle a la clase animal.
         */
        
        /* E)
        Si cambiambos de public a private la clase hija no podra sobrescribir a la clase padre ni acceder a ella. Por lo que nos dara un error.
        */
    }

}
