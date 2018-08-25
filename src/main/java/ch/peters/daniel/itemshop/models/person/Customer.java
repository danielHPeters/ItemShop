package ch.peters.daniel.itemshop.models.person;

import ch.peters.daniel.itemshop.models.product.Item;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Customer model class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Customer extends Person {
  private List<Item> inventory;
  private BigDecimal cash;
  private boolean leaving;

  public Customer(UUID id, String lastName, String firstName, LocalDate birthDate, BigDecimal cash) {
    super(id, lastName, firstName, birthDate);
    this.inventory = new ArrayList<>();
    this.cash = cash;
    this.leaving = false;
  }

  public Customer(String lastName, String firstName, LocalDate birthDate, BigDecimal cash) {
    this(UUID.randomUUID(), lastName, firstName, birthDate, cash);
  }

  public List<Item> getInventory() {
    return inventory;
  }

  public BigDecimal getCash() {
    return cash;
  }

  public void setCash(BigDecimal cash) {
    this.cash = cash;
  }

  public boolean isLeaving() {
    return this.leaving;
  }

  public void wantsToLeave() {
    this.leaving = true;
  }
}
