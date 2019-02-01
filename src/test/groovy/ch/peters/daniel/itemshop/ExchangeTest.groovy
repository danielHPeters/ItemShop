package ch.peters.daniel.itemshop

import ch.peters.daniel.itemshop.models.Shop
import ch.peters.daniel.itemshop.models.person.Customer
import ch.peters.daniel.itemshop.models.person.Employee
import spock.lang.Specification

import java.time.LocalDate

/**
 * Exchange unit test.
 *
 * @author Daniel Peters
 * @version 1.0
 */
class ExchangeTest extends Specification {
  def 'simple exchange'() {
    def shop = new Shop()
    def aBauer = new Employee('Bauer', 'Alex', LocalDate.parse('1981-11-11'))
    def customer = new Customer(
      'Miller',
      'Randy',
      LocalDate.parse('1999-04-18'),
      BigDecimal.valueOf(200)
    )
    shop.getEmployees().add(aBauer)
    def exchange = new Exchange(shop, customer)
  }
}
