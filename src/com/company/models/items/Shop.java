package com.company.models.items;

import com.company.models.people.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Shop {

    /**
     * List of general items in the store
     */
    private List<Item> stock;

    /**
     * List of consumable items in the store
     */
    private List<Consumable> consumableStock;

    /**
     * List of employees in the store
     */
    private List<Employee> employees;

    /**
     * Default constructor. Initializes the stock and employee lists
     */
    public Shop() {

        this.stock = new ArrayList<>();
        this.consumableStock = new ArrayList<>();
        this.employees = new ArrayList<>();

    }

    /**
     * Getter for the stock of items
     * @return current stock of items of this store
     */
    public List<Item> getStock() {
        return stock;
    }

    /**
     * Getter for the stock of consumable items
     *
     * @return
     */
    public List<Consumable> getConsumableStock() {
        return consumableStock;
    }

    /**
     * Getter for employee list
     *
     * @return the current list of employees of this store
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Set the stock of items of this store
     *
     * @param stock new stock
     */
    public void setStock(List<Item> stock) {
        this.stock = stock;
    }

    /**
     * Set the stock of consumable items
     *
     * @param consumableStock new consumable stock
     */
    public void setConsumableStock(List<Consumable> consumableStock) {
        this.consumableStock = consumableStock;
    }
}
