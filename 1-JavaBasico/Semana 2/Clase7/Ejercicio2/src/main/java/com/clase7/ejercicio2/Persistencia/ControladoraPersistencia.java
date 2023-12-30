package com.clase7.ejercicio2.Persistencia;

import com.clase7.ejercicio2.Clases.Platillo;
import com.clase7.ejercicio2.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author germa
 */
public class ControladoraPersistencia {

    PlatilloJpaController platilloJpa = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo) {
        platilloJpa.create(platillo);
    }

    public List<Platillo> traerPlatillos() {
        return platilloJpa.findPlatilloEntities();
    }

    public void eliminarPlatillo(int idEliminar) {
        try {
            platilloJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Platillo buscarPlatillo(int idEditar) {
        return platilloJpa.findPlatillo(idEditar);
    }

    public void editarPlatillo(Platillo platilloEdit) {
        try {
            platilloJpa.edit(platilloEdit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
