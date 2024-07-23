package com.example.practica20240723.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public String index(Model model) {  
        String message = "Hola soy marvin";
        String name="antonio";
        boolean ok=true;
        model.addAttribute("message", message);
        model.addAttribute("nombre", name);
        model.addAttribute("ok", ok);
        return "users/index";
    }
}
