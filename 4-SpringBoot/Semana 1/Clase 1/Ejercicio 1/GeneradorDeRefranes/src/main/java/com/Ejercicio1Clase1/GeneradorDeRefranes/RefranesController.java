package com.Ejercicio1Clase1.GeneradorDeRefranes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RefranesController {
    private static final String[] REFRANES = {
            "Más vale estar solo que mal acompañado.",
            "Perro ladrador poco mordedor.",
            "A caballo regalado no le mires el dentado.",
            "A lo hecho, pecho.",
            "Al mal tiempo, buena cara.",
            "Cada loco con su tema.",
            "De tal palo, tal astilla.",
            "El que la hace, la paga.",
            "Dinero llama dinero.",
            "El mundo es un pañuelo.",
            "A la tercera va la vencida.",
            "Cada oveja con su pareja.",
            "Más vale prevenir que lamentar.",
            "Más vale tarde que nunca. 15.",
            "En boca cerrada no entran moscas.",
            "Al que madruga, Dios lo ayuda.",
            "El que calla otorga.",
            "Amor con hambre no dura.",
            "Tira la piedra y esconde la mano.",
            "El que ríe el último, ríe mejor."
    };
    private final Random ramdom = new Random();

    @GetMapping
    public String refranesAleatorios(){
        int indice= ramdom.nextInt(REFRANES.length);
        return REFRANES[indice];
    }
}
