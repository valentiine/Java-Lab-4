package ca.durhamcollege;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


/**
 * File name : HourlyWorker.java
 * Student name : Valentine Sah
 * Student ID : 100757000
 * Date : December 11th 2022
 */


public class HourlyWorker extends Employee
{
    private double hourlyRate;
    private double hoursPerWeek;

    public HourlyWorker(String name, LocalDate birthDate, String employeeId, double hourlyRate, double hoursPerWeek)
    {
        super(name, birthDate, employeeId);
        setHourlyRate(hourlyRate);
        setHoursPerWeek(hoursPerWeek);
    }

    public void setHourlyRate(double hourlyRate)
    {
        if (hourlyRate < 17.0)
        {
            throw new IllegalArgumentException("Hourly rate can't be less than the minimum wage.");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHoursPerWeek(double hoursPerWeek)
    {
        if (hoursPerWeek > 48.0)
        {
            throw new IllegalArgumentException("Hours per week can't be higher than the maximum number of hours per week.");
        }
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getHoursPerWeek()
    {
        return hoursPerWeek;
    }

    public double calculatePayDay()
    {
        double weeklyEarnings = hourlyRate * hoursPerWeek;
        return Math.round(weeklyEarnings * 100) / 100.0;
    }
}