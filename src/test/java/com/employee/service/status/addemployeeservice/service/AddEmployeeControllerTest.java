package com.employee.service.status.addemployeeservice.service;

import com.employee.service.status.addemployeeservice.controller.AddEmployeeController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AddEmployeeController.class)
public class AddEmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private AddEmployeeService addEmployeeService;

    @Test
    public void test() throws Exception {
        Mockito.when(addEmployeeService.addEmployeeDetails()).thenReturn("Created");

        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/rest/employee/add").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        Assert.assertEquals("Created", result.getResponse().getContentAsString());


//
//        mockMvc.perform(post("/rest/employee/add")
//                .contentType("application/json"))
//                .andExpect(status().isOk()).andExpect(mvcResult -> mvcResult.getResponse().getContentAsString().equals("Added"));
//        System.out.println("");
    }
}