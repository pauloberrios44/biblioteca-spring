package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

    @GetMapping("/nombre/{nombreCliente}")
    public String obtenerNombreCliente(@PathVariable("nombreCliente") String nombreCliente) {
        return "Hola mundo. Yo soy " + nombreCliente;
    }
}
