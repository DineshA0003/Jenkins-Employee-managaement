package com.employee;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class EmployeeApp {

    public static void main(String[] args) throws IOException {

        Employee employee = new Employee(
            100,
            "Dinesh A",
            "AWS DevOps Engineer"
        );

        HttpServer server = HttpServer.create(
            new InetSocketAddress("0.0.0.0", 8090),
            0
        );

        server.createContext("/", exchange -> {

            String response =
                "<html>" +
                "<head><title>Employee Management</title></head>" +
                "<body>" +
                "<h1>Employee Management Application</h1>" +
                "<hr>" +
                "<h2>Employee Details</h2>" +
                "<p><b>Employee ID:</b> " + employee.getId() + "</p>" +
                "<p><b>Employee Name:</b> " + employee.getName() + "</p>" +
                "<p><b>Employee Role:</b> " + employee.getRole() + "</p>" +
                "</body>" +
                "</html>";

            exchange.getResponseHeaders().set(
                "Content-Type",
                "text/html"
            );

            exchange.sendResponseHeaders(
                200,
                response.getBytes().length
            );

            OutputStream output = exchange.getResponseBody();
            output.write(response.getBytes());
            output.close();
        });

        server.start();

        System.out.println(
            "Employee Management Application Started"
        );

        System.out.println(
            "Server running on port 8090"
        );
    }
}
