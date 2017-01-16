package com.company.models.people;

import java.util.Date;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Employee extends Person {

    private String status;

    /**
     *
     * @param name
     * @param birthDate
     */
    public Employee(String name, Date birthDate, String status) {

        super(name, birthDate);

    }
}
