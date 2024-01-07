package Clase6;

import GenericoInventario.InventarioAutos;
import Modelos.Auto;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        InventarioAutos concesionario = new InventarioAutos();

        concesionario.añadirAuto(new Auto("Toyota", "Corolla", 2023, 24000.0));
        concesionario.añadirAuto(new Auto("Seat", "Ibiza", 1965, 6000.0));
        concesionario.añadirAuto(new Auto("Ford", "Mustang", 2020, 1500.0));
        concesionario.añadirAuto(new Auto("Volkswagen", "Golf", 2015, 17000.0));
        concesionario.añadirAuto(new Auto("Toyota", "Camry", 2022, 24000.0));
        concesionario.añadirAuto(new Auto("Hyundai", "Elantra", 2020, 1900.67));
        concesionario.añadirAuto(new Auto("Mazda", "CX-5", 2019, 24000.0));

        System.out.println("Inventario inicial \n");
        concesionario.mostrarInventario();

        String marcaModelo = InventarioAutos.obtenerEntrada(" \nIngrese la maca o el año del coche para su bsuquedad:");
        List<Auto> resultadoDeLaBusquedad = concesionario.filtrarFechaModelo(concesionario.getInventario(), marcaModelo);
        System.out.println("El resultado de su busquedad es: ");
        resultadoDeLaBusquedad.forEach(System.out::println);
        
        double valorTotal = concesionario.valorTotalPrecios(concesionario.getInventario());
        System.out.println("\n El valor total de todos los coches es de: " + valorTotal + "€");
                

    }

}
