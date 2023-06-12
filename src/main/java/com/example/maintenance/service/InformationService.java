package com.example.maintenance.service;

import org.springframework.stereotype.Service;

@Service
public class InformationService {
    private String message = "一切都按预期进行。";

    public String getMessage() {
        return message;
    }

    public String setMessage(String message) {
        this.message = message;
        return this.message;
    }

    public String restMessage() {
        this.message = "一切都按预期进行。";
        return this.message;
    }
}
