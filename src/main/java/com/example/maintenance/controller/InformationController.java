package com.example.maintenance.controller;

import com.example.maintenance.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class InformationController {
    @Autowired
    InformationService informationService;

    @GetMapping("/")
    public String getMessage(Model model) {
        String message = informationService.getMessage();
        model.addAttribute("message", message);
        return "index";
    }

    @PostMapping("/")
    public String setMessage(Model model, String message) {
        String result = informationService.setMessage(message);
        model.addAttribute("message", result);
        return "index";
    }

    @PostMapping("/rest")
    public String restMessage(Model model) {
        String message = informationService.restMessage();
        model.addAttribute("message", message);
        return "index";
    }

}
