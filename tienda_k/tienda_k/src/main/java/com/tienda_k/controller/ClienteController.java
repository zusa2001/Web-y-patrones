package com.tienda_k.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ClienteController {
    

    
    @GetMapping("/")
    public String inicio(Model model) {
    
        var variable="Saludos desde el Back End";
        model.addAttribute("variable", variable);
        
        return "index";
    }
}
