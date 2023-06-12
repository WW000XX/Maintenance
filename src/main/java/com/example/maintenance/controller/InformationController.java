package com.example.maintenance.controller;

import com.example.maintenance.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InformationController {
    @Autowired
    InformationService informationService;

    @GetMapping("/")
    @ResponseBody
    public String getMessage() {
        String message = informationService.getMessage();
        return message;
    }

    @PostMapping("/")
    @ResponseBody
    public String setMessage(String message) {
        String result = informationService.setMessage(message);
        return result;
    }

    @PutMapping("/")
    @ResponseBody
    public String restMessage() {
        String message = informationService.restMessage();
        return message;
    }

}
