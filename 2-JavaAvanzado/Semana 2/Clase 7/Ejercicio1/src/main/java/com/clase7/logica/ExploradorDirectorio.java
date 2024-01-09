package com.clase7.logica;

public class ExploradorDirectorio {
    
     public void explorarDirectorio(Directorio directorio, int nivel) {
        StringBuilder espacio = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacio.append("  "); // Espacio para mostrar la jerarquía
        }
        System.out.println(espacio + directorio.getNombre() + "/");

        for (String archivo : directorio.getArchivos()) {
            System.out.println(espacio + "|-" + archivo);
        }

        for (Directorio subdirectorio : directorio.getSubdirectorios()) {
            explorarDirectorio(subdirectorio, nivel + 1);
        }
    }   
    
}
