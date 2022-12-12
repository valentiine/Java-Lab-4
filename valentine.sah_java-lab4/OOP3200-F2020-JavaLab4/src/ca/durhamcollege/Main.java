package ca.durhamcollege;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * File name : Main.java
 * Student name : Valentine Sah
 * Student ID : 100757000
 * Date : December 11th 2022
 */


public class Main
{

    public static void main(String[] args)
    {
        // Create a SalariedEmployee object
        SalariedEmployee employee;
        employee = new SalariedEmployee("Valentine Sah", LocalDate.of(2000, 12, 15), "12345678", 52000.00);

        // Print the employee's yearly salary
        System.out.println("Yearly salary: " + employee.getYearlySalary());

        // Change the employee's yearly salary
        employee.setYearlySalary(55000.00);

        // Print the employee's yearly salary
        System.out.println("New Yearly Salary: " + employee.getYearlySalary());


        // Create an HourlyWorker object
        HourlyWorker worker = new HourlyWorker("Super Mario", LocalDate.of(1999, 6, 14), "36254172", 25.00, 40.00);

        // Print the worker's hourly rate and hours per week
        System.out.println("Hourly rate: " + worker.getHourlyRate());
        System.out.println("Hours per week: " + worker.getHoursPerWeek());

        // Change the worker's hourly rate and hours per week
        worker.setHourlyRate(26.00);
        worker.setHoursPerWeek(35.00);

        // Print the worker's hourly rate and hours per week
        System.out.println("Hourly rate: " + worker.getHourlyRate());
        System.out.println("Hours per week: " + worker.getHoursPerWeek());

        try
        {
            // Create an array of Employee objects
            Employee[] employees = new Employee[]
                    {
                            new SalariedEmployee("Valentine Sah", LocalDate.of(2000, 12, 15), "12345678", 52000.00),
                            new SalariedEmployee("John Doe", LocalDate.of(1995, 5, 5), "93827345", 56000.00),
                            new HourlyWorker("Tom Teacher", LocalDate.of(1980, 2, 2), "28362534", 25.00, 40.00),
                            new HourlyWorker("Tiger Woods", LocalDate.of(1985, 3, 3), "56273849", 27.00, 35.00),
                            new HourlyWorker("Tom Brady", LocalDate.of(1970, 4, 4), "82736453", 30.00, 45.00)
                    };
        }
        catch (IllegalArgumentException ex)
        {
            // error message
            System.out.println(ex.getMessage());
        }
    }
}
