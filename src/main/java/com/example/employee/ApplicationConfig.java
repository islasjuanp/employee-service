package com.example.employee;

import com.example.employee.repository.EmployeeDAO;
import com.example.employee.repository.EmployeeListDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public EmployeeDAO employeeDAO() {
        return new EmployeeListDAO();
    }
}
