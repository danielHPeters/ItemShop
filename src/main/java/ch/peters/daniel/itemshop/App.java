package ch.peters.daniel.itemshop;

/**
 * Application main class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
