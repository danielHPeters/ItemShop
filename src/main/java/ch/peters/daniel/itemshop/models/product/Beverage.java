package ch.peters.daniel.itemshop.models.product;

import java.math.BigDecimal;

/**
 * Beverage model class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Beverage extends Item implements Consumable {
  private BigDecimal volume;

  public Beverage(BigDecimal price, String name, String details, BigDecimal priceDrop, BigDecimal volume) {
    super(price, name, details, priceDrop);
    this.volume = volume;
  }

  @Override
  public void consume() {
  }
}
