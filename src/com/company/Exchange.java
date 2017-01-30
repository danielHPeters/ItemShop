package com.company;

import com.company.models.items.Item;
import com.company.models.items.Shop;
import com.company.models.people.Customer;

/**
 * Here the shop and the customer meet to exchange items and maybe have a conversation
 *
 * Created by Daniel on 09.01.2017.
 */
public class Exchange {

    private boolean shopping;

    /**
     * Reference to the shop object
     */
    private Shop shop;

    /**
     * Reference to the customer object
     */
    private Customer customer;

    /**
     * Default constructor. Initializes references to the shop and customer objects
     *
     * @param shop
     * @param customer
     */
    public Exchange(Shop shop, Customer customer) {

        this.shop = shop;
        this.customer = customer;
        this.shopping = true;

    }

    /**
     * Loop for customer and shop exchange. When the customer decides to leave then end the loop
     */
    public void exchangeLoop() {

        this.shop.getEmployees().get(0).greetCustomer();

        while (shopping) {

            System.out.println("The customer is looking around.");

            if (customer.isLeaving()){

                System.out.println("The customer is leving");
                this.shopping = false;

            }

            customer.wantsToLeave();

        }

    }


}
