package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bodegas")
public class BodegaController {

    @GetMapping("/{codigoBodega}")
    public String obtenerNombreBodega(@PathVariable("codigoBodega") Number codigoBodega) {
        return "Bodega del diablo: " + codigoBodega.toString();
    }
}
