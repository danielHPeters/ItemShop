package ch.peters.daniel.itemshop.models.product;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Food model class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Food extends Item implements Consumable {
  private LocalDate expiryDate;

  public Food(BigDecimal price, String name, String details, BigDecimal priceDrop, LocalDate expiryDate) {
    super(price, name, details, priceDrop);
    this.expiryDate = expiryDate;
  }

  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  @Override
  public void consume() {
  }
}
