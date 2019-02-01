package ch.peters.daniel.itemshop.models.person;

import ch.peters.daniel.itemshop.models.Entity;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Person base class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Person extends Entity {
  private String lastName;
  private String firstName;
  private LocalDate birthDate;

  public Person(UUID id, String lastName, String firstName, LocalDate birthDate) {
    super(id);
    this.lastName = lastName;
    this.firstName = firstName;
    this.birthDate = birthDate;
  }

  public Person(String lastName, String firstName, LocalDate birthDate) {
    this(UUID.randomUUID(), lastName, firstName, birthDate);
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public int getAge() {
    return LocalDate.now().getYear() - birthDate.getYear();
  }
}
