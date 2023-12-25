package com.clase7.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String password = "";

        Scanner sc = new Scanner(System.in);

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, password);

            while (true) {
                System.out.println("Bienvenido a la base de datos Universidad. Selecciona un numero de los siguientes para elegir la opción:");
                System.out.println("1 Ver los estudiantes registrados en la base de datos.");
                System.out.println("2 Introducir un nuevo estudiante.");
                System.out.println("3 Borrar estudiante.");
                System.out.println("4 Salir del sistema.\n");

                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        LeerEstudiante.leer(conexion);
                        break;
                    case 2:
                        IntroducirEstudiante.crearEstudiante(conexion, sc);
                        break;
                    case 3:
                        System.out.print("Ingrese el ID del estudiante que desea borrar: ");
                        int idABorrar = sc.nextInt();
                        BorrarEstudiante.borrarEstudiante(conexion, idABorrar);
                        BorrarEstudiante.borrarEstudiante(conexion, opcion);
                        break;
                    case 4:
                        System.out.println("Cerrando programa");
                        conexion.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion no valida, introduce un valor valido");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
