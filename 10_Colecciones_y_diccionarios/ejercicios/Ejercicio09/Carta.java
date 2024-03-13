/**
 * Clase Carta
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio09;

public class Carta implements Comparable<Carta> {

  //////// Atributos
  private static String[] palos = { "Oros", "Copas", "Espadas", "Bastos" }; // Oros, Copas, Espadas y Bastos.
  private static String[] numeros = { "1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey" };
  private String valor;
  private String palo;

  //////// Constructores
  /**
   * Contructor de la clase Carta
   * 
   */
  public Carta() {
    this.palo = palos[(int) (Math.random() * 4)];
    this.valor = numeros[(int) (Math.random() * 10)];
  }

  //////// Metodos

  /**
   * toString
   */
  @Override
  public String toString() {
    return valor + " de " + palo;
  }

  public String getValor() {
    return valor;
  }

  public String getPalo() {
    return palo;
  }

  /**
   * 
   * CompareTo
   * 
   * Sacado de la solucion del libro
   * 
   * @param c Carta
   * @return int
   */
  @Override
  public int compareTo(Carta c) {
    if (palo.equals(c.getPalo())) {
      return valor.compareTo(c.getValor());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
}