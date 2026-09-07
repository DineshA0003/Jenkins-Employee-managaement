package com.employee;

public class EmployeeApp {

    public static void main(String[] args) {

        System.out.println("Employee Management Application Started");

        Employee employee = new Employee(
            101,
            "Dinesh",
            "DevOps Engineer"
        );

        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Role: " + employee.getRole());
    }
}
