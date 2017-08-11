package com.example.employee.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by juan on 10/08/17.
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class EmployeeControllerIT {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;


    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void getEmployeeThatDoesNotExist() throws Exception {
        this.mockMvc.perform(get("/employees/0")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isNotFound());
    }

}
