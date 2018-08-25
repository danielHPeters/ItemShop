package ch.peters.daniel.itemshop.models;

import ch.peters.daniel.itemshop.models.product.Consumable;
import ch.peters.daniel.itemshop.models.product.Item;
import ch.peters.daniel.itemshop.models.person.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Shop model class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Shop {
  private List<Item> stock;
  private List<Consumable> consumableStock;
  private List<Employee> employees;

  public Shop() {
    stock = new ArrayList<>();
    consumableStock = new ArrayList<>();
    employees = new ArrayList<>();
  }

  public List<Item> getStock() {
    return stock;
  }

  public List<Consumable> getConsumableStock() {
    return consumableStock;
  }

  public List<Employee> getEmployees() {
    return employees;
  }
}
