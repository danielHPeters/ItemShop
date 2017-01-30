package com.company.models.items;

/**
 * Code representation of movies
 *
 * Created by Daniel on 09.01.2017.
 */
public class Movie extends Item {

    /**
     * Age restrictions
     */
    private int ageRestriction;

    /**
     * Director of the movie
     */
    private String director;

    /**
     * Default constructor. Initializes the constructor of the base class as well as age restriction an director.
     *
     * @param price price of this movie
     * @param name name of the movie
     * @param details some details about this movie
     * @param priceDrop price drop in %( if any)
     * @param ageRestriction age restriction for this movie
     * @param director director of this movie
     */
    public Movie(double price, String name, String details, int priceDrop, int ageRestriction, String director) {

        super(price, name, details, priceDrop);
        this.ageRestriction = ageRestriction;
        this.director = director;

    }

    /**
     * Get the age restriction details of this movie
     *
     * @return age restriction
     */
    public int getAgeRestriction() {
        return ageRestriction;
    }

    /**
     * Get the director of this movie
     * @return
     */
    public String getDirector() {
        return director;
    }
}
