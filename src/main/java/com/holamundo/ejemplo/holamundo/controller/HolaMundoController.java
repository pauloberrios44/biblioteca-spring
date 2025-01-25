package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Hola mundo 2!";
    }

    @GetMapping("/alive")
    public String alive() {
        return "Alive OK";
    }

    @GetMapping("/process/{codigoSuscripcion}")
    public String procesarNombre(@PathVariable("codigoSuscripcion") Number codigoSuscripcion) {
        return "Hola a todos, el codigo de suscripcion es " + codigoSuscripcion.toString();
    }

    @GetMapping("/process/sumar/{primerNumero}/{segundoNumero}")
    public Number sumar(@PathVariable("primerNumero") Number primerNumero, @PathVariable("segundoNumero") Number segundoNumero) {

        return primerNumero.floatValue() + segundoNumero.floatValue();
    }

}
