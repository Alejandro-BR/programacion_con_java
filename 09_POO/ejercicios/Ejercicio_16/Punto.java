/**
 * Clase punto
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_16;

public class Punto {
  //////// Atributos
  private double x;
  private double y;

  //////// Contructor
  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  //////// Metodos
  /**
   * toString
   */
  @Override
  public String toString() {
    return "[x = " + x + " y = " + y + "]";
  }
}
