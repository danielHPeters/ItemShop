package com.company;

import com.company.models.items.Shop;
import com.company.models.people.Customer;
import com.company.models.people.Employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Testing of this program here.
 */
public class Main {

    /**
     * Format for parsing dates
     */
    private DateFormat format;

    /**
     * Customer of the shop
     */
    private Customer customer;

    /**
     * The shop
     */
    private Shop shop;

    /**
     * Exchange functionality between shop and customer
     */
    private Exchange exch;

    /**
     *
     */
    public Main() {

        try {

            this.format = new SimpleDateFormat("dd.MM.yyyy");
            this.shop = new Shop();
            this.shop.getEmployees().add(new Employee("Alex", this.format.parse("11.11.1981"), "Available"));
            this.customer = new Customer("Randy", this.format.parse("09.12.1999"), 200);
            this.exch = new Exchange(this.shop,this.customer);

        } catch (ParseException e){

            System.out.println("Failed to parse date string");

        }


    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Main program = new Main();
        program.exch.exchangeLoop();

    }
}
