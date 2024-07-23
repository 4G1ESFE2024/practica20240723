package com.example.practica20240723.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String index() {
        // Implementación para obtener todos los recursos
        return "home/index";
    }

    @GetMapping("/create")
    public String create() {
        // Implementación para obtener todos los recursos
        return "home/create";
    }
}
