package com.clase7.ejercicio1;

import com.clase7.logica.Directorio;
import com.clase7.logica.ExploradorDirectorio;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Creación de la estructura de directorios y archivos
        Directorio raiz = new Directorio("Raiz");
        Directorio carpeta1 = new Directorio("Carpeta1");
        Directorio carpeta2 = new Directorio("Carpeta2");
        Directorio subcarpeta = new Directorio("Subcarpeta");

        raiz.agregarSubdirectorio(carpeta1);
        raiz.agregarSubdirectorio(carpeta2);
        carpeta2.agregarSubdirectorio(subcarpeta);

        raiz.agregarArchivo("ArchivoRaiz.txt");
        carpeta1.agregarArchivo("ArchivoCarpeta1.txt");
        subcarpeta.agregarArchivo("ArchivoSubcarpeta.txt");

        // Exploración de directorios
        ExploradorDirectorio explorador = new ExploradorDirectorio();
        explorador.explorarDirectorio(raiz, 0);

    }
}
