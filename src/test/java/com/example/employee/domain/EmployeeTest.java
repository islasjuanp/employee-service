package com.example.employee.domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by juan on 15/09/17.
 */
public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp() {
        employee = new Employee(1L, "name", "lastName", "email", "phone", "01/08/1990", "title", "dept");
    }

    @Test
    public void testEmployeeId() {
        Assert.assertEquals(1L, employee.getId());
    }

    @Test
    public void testEmployeeName() {
        Assert.assertEquals("name", employee.getFirstName());
    }

    @Test
    public void testEmployeeLastName() {
        Assert.assertEquals("lastName", employee.getLastName());
    }

    @Test
    public void testEmployeeEmail() {
        Assert.assertEquals("email", employee.getEmail());
    }

    @Test
    public void testEmployeePhone() {
        Assert.assertEquals("phone", employee.getPhone());
    }

    @Test
    public void testEmployeeBirthDate() {
        Assert.assertEquals("01/08/1990", employee.getBirthDate());
    }

    @Test
    public void testEmployeeTitle() {
        Assert.assertEquals("title", employee.getTitle());
    }

    @Test
    public void testEmployeeDepartment() {
        Assert.assertEquals("dept", employee.getDept());
    }

}