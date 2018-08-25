package ch.peters.daniel.itemshop;

import ch.peters.daniel.itemshop.models.Shop;
import ch.peters.daniel.itemshop.models.person.Customer;

/**
 * Here the shop and the customer meet to exchange items and maybe have a conversation.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Exchange {
  private boolean shopping;
  private Shop shop;
  private Customer customer;

  public Exchange(Shop shop, Customer customer) {
    this.shop = shop;
    this.customer = customer;
    this.shopping = true;
  }

  /**
   * Loop for customer and shop exchange.
   * When the customer decides to leave then end the loop.
   */
  public void exchangeLoop() {
    System.out.println(shop.getEmployees().get(0).greeting());

    while (shopping) {
      System.out.println("The customer is looking around.");

      if (customer.isLeaving()) {
        System.out.println("The customer is leaving.");
        shopping = false;
      }

      customer.wantsToLeave();
    }
  }
}
