package com.clase7.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author germa
 */
public class IntroducirEstudiante {

    protected static void crearEstudiante(Connection conexion, Scanner sc) throws Exception {

        String insert = "INSERT INTO estudiante (nombre, edad, calificacion) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(insert)) {

            System.out.println("Introduce el nombre del estudiante");
            sc.nextLine();
            String nombre = sc.nextLine();

            System.out.println("Introduce la edad del estudiante");
            int edad = sc.nextInt();

            System.out.println("Introduce la calificacion del estudiante");
            double calificacion = sc.nextDouble();

            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);
            preparedStatement.setDouble(3, calificacion);
            preparedStatement.executeUpdate();

            System.out.println("Estudiante creado correctamente.\n");

        }
    }
}
