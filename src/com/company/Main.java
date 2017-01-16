package com.company;

import com.company.models.Shop;
import com.company.models.people.Customer;

import java.util.Date;

public class Main {

    /**
     *
     */
    private Customer customer;

    /**
     *
     */
    private Shop shop;

    /**
     *
     */
    private Exchange exch;

    /**
     *
     */
    public Main() {
        this.customer = new Customer("Randy", new Date(12,12,2016), 200);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // write your code here
    }
}
