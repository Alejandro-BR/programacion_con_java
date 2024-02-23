/**
 * Clae Gato  
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_02_arrays;

public class Gato {
  //////// Atributos
  private String nombre;
  private String color;
  private String sexo;

  //////// Contructor
  public Gato(String nombre, String color, String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.sexo = sexo;
  }

  //////// Metodos
  @Override
  public String toString() {
    return "Gato [nombre=" + nombre + ", color=" + color + ", sexo=" + sexo + "]";
  }

}
