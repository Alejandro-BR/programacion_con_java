/**
 * Clase Publicacion
 * 
 * Sus subClases son Libro y Revista
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_12;

public abstract class Publicacion {

  //////// Atributos
  private String isbn;
  private String titulo;
  private int añoPublicacion;

  //////// Contructor
  /**
   * Contructor de la super clase abtracta Publicacion
   * 
   * @param isbn           String
   * @param titulo         String
   * @param añoPublicacion int
   */
  public Publicacion(String isbn, String titulo, int añoPublicacion) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.añoPublicacion = añoPublicacion;
  }

  /////// Metodos

  /**
   * Conocer la ISBN
   * 
   * @return String isbn
   */
  public String getIsbn() {
    return isbn;
  }

  /**
   * Conocer el titulo
   * 
   * @return String titulo
   */
  public String getTitulo() {
    return titulo;
  }

  /**
   * Conocer el año de publicacion
   * 
   * @return int añoPublicacion
   */
  public int getAñoPublicacion() {
    return añoPublicacion;
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return " isbn = " + isbn + ", titulo = " + titulo + ", añoPublicacion = " + añoPublicacion + " ";
  }

}
