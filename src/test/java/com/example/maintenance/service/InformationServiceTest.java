package com.example.maintenance.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InformationServiceTest {

    @Test
    public void testGetMessage() {
        InformationService informationService = new InformationService();
        assertEquals("一切都按预期进行。", informationService.getMessage());
    }

    @Test
    public void testSetMessage() {
        InformationService informationService = new InformationService();
        informationService.setMessage("新的信息");
        assertEquals("新的信息", informationService.getMessage());
    }

    @Test
    public void testRestMessage() {
        InformationService informationService = new InformationService();
        informationService.setMessage("新的信息");
        informationService.restMessage();
        assertEquals("一切都按预期进行。", informationService.getMessage());
    }
}