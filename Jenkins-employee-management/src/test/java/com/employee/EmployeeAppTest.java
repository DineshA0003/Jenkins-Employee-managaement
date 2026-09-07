package com.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeAppTest {

    @Test
    void testEmployee() {

        Employee employee =
            new Employee(101, "Dinesh", "DevOps Engineer");

        assertEquals(101, employee.getId());
        assertEquals("Dinesh", employee.getName());
        assertEquals("DevOps Engineer", employee.getRole());
    }
}
