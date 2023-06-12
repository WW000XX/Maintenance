package com.example.maintenance.controller;

import com.example.maintenance.service.InformationService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class InformationControllerTest {

    @Mock
    private InformationService informationService;

    @InjectMocks
    private InformationController informationController;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(informationController).build();
    }

    @Test
    public void testGetMessage() throws Exception {
        when(informationService.getMessage()).thenReturn("一切都按预期进行。");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testSetMessage() throws Exception {
        when(informationService.setMessage(anyString())).thenReturn("完成");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/").characterEncoding("utf-8")
                .param("message", "新的信息");
        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testRestMessage() throws Exception {
        when(informationService.restMessage()).thenReturn("一切都按预期进行。");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/").characterEncoding("utf-8");
        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andReturn();
    }
}