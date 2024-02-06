/**
 * Clase Libro
 * 
 * SubClase de Publicacion
 * Implementa la interfaz Prestable
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_12;

public class Libro extends Publicacion implements Prestable {

  //////// Atributos
  private boolean prestado;

  //////// Contructor
  /**
   * Conctructor de la clase libro
   * 
   * @param isbn           String
   * @param titulo         String
   * @param añoPublicacion int
   *                       prestado = falso
   * 
   */
  public Libro(String isbn, String titulo, int añoPublicacion) {
    super(isbn, titulo, añoPublicacion);
    this.prestado = false;
  }

  //////// Metodos

  /**
   * Devolver el libro
   */
  @Override
  public void devuelve() {
    prestado = false;
  }

  /**
   * Saber si el libro esta prestado o no
   * 
   * @return boolean prestado
   */
  @Override
  public boolean estaPrestado() {
    return prestado;
  }

  /**
   * Prestar el libro
   */
  @Override
  public void presta() {
    prestado = true;
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    if (prestado) {
      return "Libro" + super.toString() + " (prestado)";
    } else {
      return "Libro" + super.toString() + " (no prestado)";
    }
  }

}
