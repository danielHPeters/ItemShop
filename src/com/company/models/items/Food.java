package com.company.models.items;

import java.util.Date;

/**
 * Representation of food items
 *
 * Created by Daniel on 09.01.2017.
 */
public class Food extends Item {

    private Date expiryDate;

    /**
     *  Default constructor. Initializes price, name, details, priceDrop and expiryDate of the food item
     *
     * @param price price of this food item
     * @param name name of this food
     * @param details details about this food
     * @param priceDrop possible price drop on this food
     * @param expiryDate expiry date of this food
     */
    public Food(double price, String name, String details, int priceDrop, Date expiryDate) {

        super(price, name, details, priceDrop);
        this.expiryDate = expiryDate;

    }

    /**
     * Get the expiry date of this food item
     * @return the expiry date of this food item
     */
    public Date getExpiryDate() {
        return expiryDate;
    }
}
