package ch.peters.daniel.itemshop.models.product;

import java.math.BigDecimal;

/**
 * Movie model class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Movie extends Item {
  private int ageRestriction;
  private String director;

  public Movie(BigDecimal price, String name, String details, BigDecimal priceDrop, int ageRestriction, String director) {
    super(price, name, details, priceDrop);
    this.ageRestriction = ageRestriction;
    this.director = director;
  }

  public int getAgeRestriction() {
    return ageRestriction;
  }

  public String getDirector() {
    return director;
  }
}
