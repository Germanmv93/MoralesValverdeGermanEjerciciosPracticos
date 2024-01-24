package com.Clase1Ejercicio2.DatosCuriosos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DatosController {
    private static final String[] DATOS = {
            "El chocolate ayuda a la protección del corazón",
            "Un litro de gaseosa = doscientos litros de agua",
            "McDonald’s no vendía hamburguesas",
            "¿Sabías que existen más de 10 mil tipos de tomates?",
            " Los osos pandas pasan 12 horas al día comiendo",
            "Los aguacates no son una verdura, son una fruta.",
            "Hay ciudades en el mundo donde está prohibido morir.",
            "Cuando dos personas están enamoradas, sus latidos se sincronizan.",
            "En los hospitales de Japón no hay habitaciones con el número 4 ni con el número 9.",
            "La Torre Eiffel es casi 15 cm más alta durante el verano.",
            "Los elefantes piensan que los humanos somos adorables.",
            "Existe una fobia a los patrones de agujeros pequeños, y se llama tripofobia.",
            "Los cocodrilos no pueden sacar la lengua.",
            "La hora más feliz del mundo es las 19:00.",
            "El desierto del Sahara era una selva tropical."
    };

    private final Random random = new Random();

    @GetMapping
    public String DatosCuriosos() {
        int indice = random.nextInt(DATOS.length);
        return DATOS[indice];
    }
}


