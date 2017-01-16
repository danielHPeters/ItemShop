package com.company.models.items;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Movie extends Item {

    /**
     * Age restrictions
     */
    private int ageLimit;

    /**
     * Director of the movie
     */
    private String director;

    /**
     * Default constructor. Initializes the constructor of the base class as well as age restriction an director.
     *
     * @param price
     * @param name
     * @param details
     * @param priceDrop
     * @param ageLimit
     * @param director
     */
    public Movie(double price, String name, String details, int priceDrop, int ageLimit, String director) {

        super(price, name, details, priceDrop);
        this.ageLimit = ageLimit;
        this.director = director;

    }

    /**
     * @return
     */
    public int getAgeLimit() {
        return ageLimit;
    }

    /**
     * @return
     */
    public String getDirector() {
        return director;
    }
}
