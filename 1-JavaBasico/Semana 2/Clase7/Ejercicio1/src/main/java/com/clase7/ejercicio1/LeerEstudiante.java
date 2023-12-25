/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase7.ejercicio1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author germa
 */
public class LeerEstudiante {

    protected static void leer(Connection conexion) throws SQLException {

        Statement statement = conexion.createStatement();
        String selectAll = "SELECT * FROM estudiante";

        ResultSet resultado = statement.executeQuery(selectAll);
        while (resultado.next()) {

            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            int edad = resultado.getInt("edad");
            Double calificacion = resultado.getDouble("calificacion");
            System.out.println("Id:" + id + ", Nombre:" + nombre + ", Edad:" + edad
                    + ", Calificacion:" + calificacion);
        }
        System.out.println("");

        resultado.close();
        statement.close();
    }

}
