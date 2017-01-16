package com.company;

import com.company.models.items.Shop;
import com.company.models.people.Customer;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Exchange {

    /**
     * Reference to the shop object
     */
    private Shop shop;

    /**
     * Reference to the customer object
     */
    private Customer customer;

    /**
     *
     * @param shop
     * @param customer
     */
    public Exchange (Shop shop, Customer customer){

        this.shop = shop;
        this.customer = customer;

    }


}
