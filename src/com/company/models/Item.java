package com.company.models;

/**
 * Created by Daniel on 09.01.2017.
 */
public abstract class Item {

    /**
     *
     */
    private double price;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String details;

    /**
     *
     */
    private int priceDrop;

    /**
     * Default constructor
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
     *
     * @return
     */
    public double getPrice() {
        return price;
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
    public String getDetails() {
        return details;
    }

    /**
     *
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
