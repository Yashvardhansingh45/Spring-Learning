package com.example.helloworldspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web") // Base path for Web pages
public class MVCHelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz (Thymeleaf)");
        return "hello"; // This maps to hello.html in templates
    }
}