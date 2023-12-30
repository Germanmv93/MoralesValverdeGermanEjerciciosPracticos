package com.clase7.ejercicio2;

import com.clase7.ejercicio2.Clases.Controladora;
import com.clase7.ejercicio2.Clases.Platillo;
import java.util.List;

/**
 *
 * @author germa
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        System.out.println("Creamos los platillos de nuestra base de datos restaurante");

        Platillo platillo1 = new Platillo(1, "Raneb", "Secreta", 15.0);
        Platillo platillo2 = new Platillo(2, "Espaguetis", "Carbonara", 8.0);
        Platillo platillo3 = new Platillo(3, "Rabo de toro", "Casera", 24.0);

        control.crearPlatillo(platillo1);
        control.crearPlatillo(platillo2);
        control.crearPlatillo(platillo3);

        System.out.println("Eliminamos el platillo con el id numero 2");

        int idEliminar = 3;
        control.eliminarPlatillo(idEliminar);

        System.out.println("Modificnao el precio del plato 2");

        int idEditar = 2;
        Platillo platilloEdit = control.buscarPlatillo(idEditar);
        platilloEdit.setPrecio(30.0);

        control.editarPlatillo(platilloEdit);

        System.out.println("Lista final de platillos");

        List<Platillo> listaPlatillos = control.traerPlatillos();
        for (Platillo platillo : listaPlatillos) {
            System.out.println(platillo.toString());
        }
    }

}
