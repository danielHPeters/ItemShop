package com.company.models.people;

import java.util.Date;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Person {

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Date birthDate;

    /**
     *
     * @param name
     * @param birthDate
     */
    public Person (String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int calcAge(){

    }
}
