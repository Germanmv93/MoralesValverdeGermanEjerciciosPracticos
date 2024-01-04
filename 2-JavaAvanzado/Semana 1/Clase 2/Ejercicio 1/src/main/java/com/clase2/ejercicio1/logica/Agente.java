package com.clase2.ejercicio1.logica;

import com.clase2.ejercicio1.agenteDeLlamadas.ColaLlamadas;

/**
 *
 * @author germa
 */
public class Agente extends Thread {

    private ColaLlamadas colaLlamadas;

    public Agente(ColaLlamadas colaLlamadas) {
        this.colaLlamadas = colaLlamadas;
    }

    @Override
    public void run() {
        colaLlamadas.atender();
    }

}
