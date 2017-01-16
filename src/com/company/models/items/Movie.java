package com.company.models.items;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Movie extends Item {

    /**
     *
     */
    private int ageLimit;

    /**
     *
     */
    private String director;

    /**
     *
     */
    public Movie(double price, String name, String details, int priceDrop){
        super(price, name, details, priceDrop);
    }

    /**
     *
     * @return
     */
    public int getAgeLimit() {
        return ageLimit;
    }

    /**
     *
     * @return
     */
    public String getDirector() {
        return director;
    }
}
