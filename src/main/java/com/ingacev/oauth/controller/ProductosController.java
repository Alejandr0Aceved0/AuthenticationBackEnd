package com.ingacev.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductosController {

    @GetMapping("/productos")
    public String obtener(){
        return "info producto";
    }
}
