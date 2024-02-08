package com.MoralesGerman.clase2Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

    @GetMapping("/convert")
    public String convertCmToMeters(@RequestParam(name = "cm") double cm) {
        double meters = cm / 100;
        return String.format("El equivalente a %.2f cm es de %.2f metros", cm, meters);
    }
}
