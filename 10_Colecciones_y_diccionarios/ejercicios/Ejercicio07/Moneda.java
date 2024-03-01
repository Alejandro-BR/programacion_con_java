/**
 * Clase Moneda
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio07;

public abstract class Moneda {
  //////// Atributos
  private static String[] opciones = {"cara", "cruz"};
  private int valor;
  private String lado;

  //////// Conctructor
  /**
   * Contructor de moneda
   * 
   * @param valor int
   * lado - cara o cruz
   */
  public Moneda(int valor) {
    this.valor = valor;
    this.lado = opciones[((int)(Math.random()*2))];
  }

  //////// Metodos

  public int getValor() {
    return valor;
  }

  public String getLado() {
    return lado;
  }

  @Override
  public String toString() {
    return "Moneda [valor=" + valor + ", lado=" + lado + "]";
  }
}

