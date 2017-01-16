package com.company.models.people;

import com.company.models.items.Item;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Customer extends Person {

    /**
     *
     */
    private List<Item> inventory;

    /**
     * Money of the customer
     */
    private double cash;

    /**
     * @param name
     * @param birthDate
     */
    public Customer(String name, Date birthDate, double cash) {
        super(name, birthDate);
        this.inventory = new ArrayList<>();
        this.cash = cash;
    }

    /**
     * Get inventory of Customer
     * @return inventory of the customer
     */
    public List<Item> getInventory() {
        return inventory;
    }

    /**
     * Set the inventory of the customer
     * @param inventory new inventory
     */
    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    /**
     * Get cash stock of customer
     * @return cash of customer
     */
    public double getCash() {
        return cash;
    }

    /**
     * Set the cash stock of customer
     * @param cash new cash stock
     */
    public void setCash(double cash) {
        this.cash = cash;
    }
}
