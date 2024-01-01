package com.clase2.ejercicio2.logica;

import com.clase2.ejercicio2.agenteDeLlamadas.ColaLlamadas;

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
