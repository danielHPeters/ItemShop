package com.company.models.people;

import java.util.Date;

/**
 * Template for humanoids
 *
 * Created by Daniel on 09.01.2017.
 */
public class Person {

    /**
     * Name of the person
     */
    private String name;

    /**
     * Birthdate of the person
     */
    private Date birthDate;

    /**
     * Default constructor. Sets name and birthdate of the Person
     * @param name
     * @param birthDate
     */
    public Person (String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    /**
     * Getter for name of Person
     * @return name of the Person
     */
    public String getName() {
        return name;
    }

    /**
     * Function to calculate the age of the Person based on birthdate
     * @return the current age of the person
     */
    public int calcAge(){
        return 10;
    }
}
