package com.ingacev.oauth.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductosController {

    @GetMapping("/productos")
    public String obtener(@AuthenticationPrincipal OAuth2User user){
        //@AuthenticationPrincipal ayuda a obtener los datos de autenticacion del
        // usuario, en este caso nombe y datos del usuario logeado con githubgithub

        return "info producto" + user;
    }
}
