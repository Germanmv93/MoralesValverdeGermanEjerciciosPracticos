package Clase3y5.ejercicio2.modelos;

import java.time.LocalDate;

/**
 *
 * @author germa
 */
public class Agenda {

    private String nombre;
    private LocalDate fecha;
    private String categoria;

    public Agenda() {
    }

    public Agenda(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", fecha=" + fecha + ", categoria=" + categoria + '}';
    }

}
