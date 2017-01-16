package com.company.models.items;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Food extends Item {

    /**
     *
     * @param price
     * @param name
     * @param details
     * @param priceDrop
     */
    public Food(double price, String name, String details, int priceDrop) {
        super(price, name, details, priceDrop);
    }
}
