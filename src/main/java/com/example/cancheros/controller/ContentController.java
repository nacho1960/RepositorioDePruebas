package com.example.cancheros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin(origins = "*")

public class ContentController {
    @GetMapping ("/home")
    public String handleWelcome(){

        return "estoy en home";}//asocia con el anonimo que solo tiene acceso a home
    @GetMapping ("/user/home")
    public String handleUserHome(){ return "estoy en user";}//este tiene acceso a home user capaz de reservar cancha etc
    @GetMapping ("/admin/home")
    public String handleAdminHome(){ return "estoy en admin";}//tiene todos los permisos posibles puede desde alquilar hasta crerar nuevas canchas
    @GetMapping("/login")
    public String handleLogin() {
        return "login";
    }
}