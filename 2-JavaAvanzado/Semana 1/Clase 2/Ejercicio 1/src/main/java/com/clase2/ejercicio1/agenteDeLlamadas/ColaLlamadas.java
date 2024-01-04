package com.clase2.ejercicio1.agenteDeLlamadas;

import com.clase2.ejercicio1.logica.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author germa
 */
public class ColaLlamadas {

    private int numeroAgentes = 8;
    private List<Cliente> llamadas = new ArrayList<>();
    private int ordenLlamadas = 0;

    public synchronized void recibir(Cliente cliente) {
        llamadas.add(cliente);
        System.out.println("La llamada ha sido recibida por el cliente " + cliente.getNombre());
        atender();
    }

    public void atender() {
        while (ordenLlamadas < llamadas.size()) {
            Cliente cliente = llamadas.get(ordenLlamadas);
            System.out.println("Buenos dias señor " + cliente.getNombre() + " esta usted hablando con el agente " + Thread.currentThread().getName());
            ordenLlamadas++;

            try {
                Thread.sleep(1900);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }

}
