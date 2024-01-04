package com.clase2.ejercicio1;

import com.clase2.ejercicio1.agenteDeLlamadas.ColaLlamadas;
import com.clase2.ejercicio1.logica.Agente;
import com.clase2.ejercicio1.logica.Cliente;

/**
 *
 * @author germa
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        ColaLlamadas colaLlamadas = new ColaLlamadas();

        for (int i = 1; i < 10; i++) {
            Thread hiloAgente = new Agente(colaLlamadas);
            hiloAgente.start();

        }
        
        Cliente[] clientes = {
            new Cliente("Jose"),
            new Cliente("Andres"),
            new Cliente("Maria"),
            new Cliente("Sandra"),
            new Cliente("Miguel"),
            new Cliente("Pepe"),
            new Cliente("Isabel"),
            new Cliente("Jose Daniel"),
            new Cliente("Laura"),
            new Cliente("Germán"),
            new Cliente("Hugo")
        };
        
        for (Cliente cliente : clientes) {
            colaLlamadas.recibir(cliente);
        }
    }
}
