/**
 * Clase centimo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio07;

public class Centimo extends Moneda {
  //////// Atributos
  private static int[] numero = {1,2,5,10,20,50};

  //////// Contructor
  public Centimo() {
    super(numero[(int)(Math.random()*6)]);
  }

  //////// Metodos
  @Override
  public String toString() {
    return getValor() + " centimos - " + getLado();
  }
}
