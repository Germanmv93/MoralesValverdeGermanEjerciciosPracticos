
package com.clase10.ejercicio1.persistencia;

import com.clase10.ejercicio1.logica.Votos;
import java.util.List;

public class ControladoraPersistencia {
    VotosJpaController ControladoraPu = new VotosJpaController();
    
    public void añadirVotos(Votos votos){
        ControladoraPu.create(votos);
    }
    
    public List<Votos> mostrarVotos(){
        return ControladoraPu.findVotosEntities();
    }
}
