package ch.peters.daniel.itemshop.models;

import java.io.Serializable;
import java.util.UUID;

/**
 * Entity base class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class Entity implements Serializable {
  private UUID id;

  public Entity(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }
}
