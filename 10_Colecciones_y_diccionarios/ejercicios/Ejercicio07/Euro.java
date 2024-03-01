/**
 * Clase euro
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio07;

public class Euro extends Moneda {
  //////// Atributos
  private static int[] numero = {1,2};

  //////// Contructor
  public Euro() {
    super(numero[(int)(Math.random()*2)]);
  }

  //////// Metodos
  @Override
  public String toString() {
    return getValor() + " euro - " + getLado();
  }

}
