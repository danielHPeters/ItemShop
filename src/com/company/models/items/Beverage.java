package com.company.models.items;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Beverage extends Item implements Consumable {

    /**
     *
     */
    private int volume;

    /**
     * @param price
     * @param name
     * @param details
     * @param priceDrop
     */
    public Beverage(double price, String name, String details, int priceDrop, int volume) {

        super(price, name, details, priceDrop);
        this.volume = volume;

    }

    /**
     *
     */
    @Override
    public void consume() {

    }
}
