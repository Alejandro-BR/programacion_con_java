/**
 * Ejemplo primera lectura de datos (clase 27/10/2023)
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Ejemplo01 {
  public static void main(String[] args) {
    
    String nombre;
    System.out.print("Dime como te llamas: ");
    nombre = System.console().readLine();
    
    System.out.println("¡Hola " + nombre + " ! Bienvenid@ a programacion");
  }
}