package com.clase7.ejercicio2.Clases;

import com.clase7.ejercicio2.Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author germa
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPlatillo(Platillo platillo) {
        controlPersis.crearPlatillo(platillo);
    }

    public List<Platillo> traerPlatillos() {
        return controlPersis.traerPlatillos();
    }

    public void eliminarPlatillo(int idEliminar) {
        controlPersis.eliminarPlatillo(idEliminar);
    }

    public Platillo buscarPlatillo(int idEditar) {
        return controlPersis.buscarPlatillo(idEditar);
    }

    public void editarPlatillo(Platillo platilloEdit) {
        controlPersis.editarPlatillo(platilloEdit);
    }
}
