package ch.peters.daniel.itemshop.models.person;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Employee model Class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Employee extends Person {
  public enum Status {
    AVAILABLE, WORKING, SICK, ON_VACATION
  }

  private Status status;

  public Employee(UUID id, String lastName, String firstName, LocalDate birthDate, Status status) {
    super(id, lastName, firstName, birthDate);
    this.status = status;
  }

  public Employee(String lastName, String firstName, LocalDate birthDate) {
    this(UUID.randomUUID(), lastName, firstName, birthDate, Status.AVAILABLE);
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public String greeting() {
    return "Welcome. How can I help you?";
  }
}
