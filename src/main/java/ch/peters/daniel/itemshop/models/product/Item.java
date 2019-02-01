package ch.peters.daniel.itemshop.models.product;

import java.math.BigDecimal;

/**
 * Item base class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class Item {
  private BigDecimal price;
  private String name;
  private String details;
  private BigDecimal priceDrop;

  public Item(BigDecimal price, String name, String details, BigDecimal priceDrop) {
    this.price = price;
    this.name = name;
    this.details = details;
    this.priceDrop = priceDrop;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDetails() {
    return details;
  }

  public BigDecimal getPriceDrop() {
    return priceDrop;
  }

  /**
   * Calculate the price including reductions.
   */
  public BigDecimal currentPrice() {
    return price.subtract(price.multiply(priceDrop));
  }
}
