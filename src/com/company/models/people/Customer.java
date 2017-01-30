package com.company.models.people;

import com.company.models.items.Item;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representation of a customer
 *
 * Created by Daniel on 09.01.2017.
 */
public class Customer extends Person {

    /**
     * Inventory of the customer (only objects of type Item)
     */
    private List<Item> inventory;

    /**
     * Money of the customer
     */
    private double cash;

    /**
     * Boolean flag for when the customer wants to leave the store
     */
    private boolean leaving;

    /**
     * @param name
     * @param birthDate
     */
    public Customer(String name, Date birthDate, double cash) {
        super(name, birthDate);
        this.inventory = new ArrayList<>();
        this.cash = cash;
        this.leaving = false;
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

    /**
     * Check if the customer wants to leabe
     */
    public boolean isLeaving(){
        return this.leaving;
    }

    public void wantsToLeave(){
        this.leaving = true;
    }
}
