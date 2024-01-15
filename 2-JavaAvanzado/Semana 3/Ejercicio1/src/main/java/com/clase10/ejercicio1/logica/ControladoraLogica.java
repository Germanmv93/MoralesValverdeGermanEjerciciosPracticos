
package com.clase10.ejercicio1.logica;

import com.clase10.ejercicio1.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


public class ControladoraLogica {
    ControladoraPersistencia persistenciaLogica = new ControladoraPersistencia();
    
    public void añadirVotos(Votos votos){
        persistenciaLogica.añadirVotos(votos);
    }
    
    public List<Votos> mostrarVotos (){
        return persistenciaLogica.mostrarVotos();
    }
}
