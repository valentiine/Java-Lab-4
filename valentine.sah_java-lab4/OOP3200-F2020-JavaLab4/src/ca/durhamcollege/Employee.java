package ca.durhamcollege;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * File name : Employee.java
 * Student name : Valentine Sah
 * Student ID : 100757000
 * Date : December 11th 2022
 */


public abstract class Employee extends Person
{
    // ATTRIBUTES
    private final String myEmployeeId;

    /**
     * Initializes an Employee object based on parameters.
     *
     * @param fullName - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @param employeeId - the intended 8-digit employee ID.
     * @throws IllegalArgumentException when fullName contains less than one
     * character or when fullName contains something other than letters, spaces,
     * hyphens, or apostrophes, or when employeeId does not contain 8 digits.
     */
    public Employee(String fullName, LocalDate birthDate, String employeeId)
    {
        // call the parent class constructor
        super(fullName, birthDate);

        // validate the employee ID
        if (employeeId == null || employeeId.length() != 8 || !employeeId.matches("[0-9]+"))
        {
            throw new IllegalArgumentException("Employee ID must be a 8-digit number.");
        }

        // set the employee ID
        myEmployeeId = employeeId;
    }

    /**
     * Returns the employee ID.
     *
     * @return this employee ID.
     */
    public String getEmployeeId()
    {
        return myEmployeeId;
    }

    /**
     * Calculates and returns the amount this employee would earn each pay period.
     *
     * @return the amount this employee would earn each pay period.
     */
    public abstract double calculatePayDay();
}

