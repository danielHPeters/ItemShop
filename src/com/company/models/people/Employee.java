package com.company.models.people;

import java.util.Date;

/**
 * Representation of employees working in the shop
 *
 * Created by Daniel on 09.01.2017.
 */
public class Employee extends Person {

    /**
     * Status of the employee. (busy, available, sick etc.)
     */
    private String status;

    /**
     * Default constructor
     *
     * @param name name of the employee
     * @param birthDate birthday of the employee
     */
    public Employee(String name, Date birthDate, String status) {

        super(name, birthDate);

        this.status = status;

    }

    /**
     * Getter for the status of the employee
     * @return the current status of the employee
     */
    public String getStatus() {
        return status;
    }

    /**
     * Greeting customer
     */
    public void greetCustomer() {

        System.out.println("Welcome. How can I help you?");

    }
}
