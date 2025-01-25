package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/producto")
public class ProductoController {

    @GetMapping("/{codigoProducto}")
    public String mostrarCodigoProducto(@PathVariable("codigoProducto") String codigoProducto) {
        return "Codigo de producto: " + codigoProducto;
    }

}
