package com.clase2.ejercicio2;

import com.clase2.ejercicio2.agenteDeLlamadas.ColaLlamadas;
import com.clase2.ejercicio2.logica.Agente;
import com.clase2.ejercicio2.logica.Cliente;

/**
 *
 * @author germa
 */
public class Ejercicio2 {

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
