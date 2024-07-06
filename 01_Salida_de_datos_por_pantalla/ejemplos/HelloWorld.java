/**
 * Hola Mundo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class HelloWorld {
  public static void main(String[] args) {
    final String CYAN = "\033[0;36m";   
    final String RESET = "\033[0m";

    System.out.println(CYAN + "\n" + "Hello World in Java 😁" + RESET);
  }
}
