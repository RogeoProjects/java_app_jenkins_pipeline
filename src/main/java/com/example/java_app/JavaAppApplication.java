package com.example.java_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class JavaAppApplication {

    @GetMapping("/")
    public String home(Model model) {
        // Adicione atributo para o modelo
        model.addAttribute("message", "Hello, world!");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaAppApplication.class, args);
    }

}
