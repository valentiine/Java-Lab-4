package ca.durhamcollege;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


/**
 * File name : SalariedEmployee.java
 * Student name : Valentine Sah
 * Student ID : 100757000
 * Date : December 11th 2022
 */


public class SalariedEmployee extends Employee
{
    private double yearlySalary;

    public SalariedEmployee(String name, LocalDate birthDate, String employeeId, double yearlySalary)
    {
        super(name, birthDate, employeeId);
        setYearlySalary(yearlySalary);
    }

    public void setYearlySalary(double yearlySalary)
    {
        if (yearlySalary < 0)
        {
            throw new IllegalArgumentException("Yearly salary cannot be negative.");
        }
        this.yearlySalary = yearlySalary;
    }

    public double getYearlySalary()
    {
        return yearlySalary;
    }

    public double calculatePayDay()
    {
        double weeklySalary = yearlySalary / 52;
        return Math.round(weeklySalary * 100) / 100.0;
    }
}
