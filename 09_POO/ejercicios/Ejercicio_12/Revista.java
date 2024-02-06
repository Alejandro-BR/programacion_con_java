/**
 * Clase Revista
 * 
 * SubClase de Publicacion
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_12;

public class Revista extends Publicacion {
  //////// Atributos
  private int numero;

  //////// Contructor
  /**
   * Contructro de la clase Revista
   * 
   * @param isbn           String
   * @param titulo         String
   * @param añoPublicacion int
   * @param numero         int
   */
  public Revista(String isbn, String titulo, int añoPublicacion, int numero) {
    super(isbn, titulo, añoPublicacion);
    this.numero = numero;
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return "Revista" + super.toString() + " numero = " + numero;
  }

  /**
   * Obtener el numero de la revista
   * 
   * @return numero
   */
  public int getNumero() {
    return numero;
  }
}
