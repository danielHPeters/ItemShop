package com.company.models.items;

/**
 * Template for items to be sold in the shop
 *
 * Created by Daniel on 09.01.2017.
 */
public abstract class Item {

    /**
     * Base prise of the item
     */
    private double price;

    /**
     * Name of the item
     */
    private String name;

    /**
     * Details about item
     */
    private String details;

    /**
     * price drop from 0 to 100 (percentage by which the price will be reduced)
     */
    private int priceDrop;

    /**
     * Default constructor. Sets the base price, name, details, and the current price drop
     *
     * @param price
     * @param name
     * @param details
     * @param priceDrop
     */
    public Item(double price, String name, String details, int priceDrop) {
        this.price = price;
        this.name = name;
        this.details = details;
        this.priceDrop = priceDrop;
    }

    /**
     * Get the price of this item
     *
     * @return the price of this item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the name of this item
     *
     * @return the name of this item
     */
    public String getName() {
        return name;
    }

    /**
     * Get the details of this item
     *
     * @return the details of this item
     */
    public String getDetails() {
        return details;
    }

    /**
     * Set the price of this item
     *
     * @param price new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Calculate the price including reductions
     */
    public void calcPrice() {
        this.price = this.price - (this.price * this.priceDrop);
    }
}
