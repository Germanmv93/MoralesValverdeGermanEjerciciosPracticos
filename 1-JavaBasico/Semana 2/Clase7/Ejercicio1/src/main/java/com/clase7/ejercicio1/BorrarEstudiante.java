/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase7.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author germa
 */
public class BorrarEstudiante {

    protected static void borrarEstudiante(Connection conexion, int id) {
        String sql = "DELETE FROM estudiante WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);

            int filasBorradas = statement.executeUpdate();

            if (filasBorradas > 0) {
                System.out.println("El estudiante con el " + id + " ha sido borrado exitosamente.");

            } else {
                System.out.println("No se encontró ningún estudiante con el ID " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
