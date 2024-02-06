/**
 * Interfaz Prestable
 * 
 * La clase Libro debe implementar la interfaz Prestable que tiene los métodos
 * presta, devuelve y estaPrestado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_12;

public interface Prestable {
  //////// Metodos
  public abstract void devuelve();

  public abstract boolean estaPrestado();

  public abstract void presta();

}
