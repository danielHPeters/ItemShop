package com.company.models.items;

/**
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
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     */
    public void calcPriceDrop() {
        this.price = this.price - (this.price * this.priceDrop);
    }
}
