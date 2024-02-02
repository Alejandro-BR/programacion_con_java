/**
 * SubClase Canario
 * 
 * Sub clase de la calse Ave
 * Que a su vez es sub clase de la clase Animal
 * 
 * @author Alejandro Barrionuevo Rosado
 */
package Ejercicio_03;
public class Canario extends Ave {

  //////// Atributos
  private String color;

  //////// Contructores

  /**
   * Conctructor completo
   * 
   * @param s     Sexo
   * @param color String
   */
  public Canario(Sexo s, String color) {
    super(s);
    this.color = color;
  }

  /**
   * Contructor donde le dira su sexo
   * 
   * @param s Sexo
   */
  public Canario(Sexo s) {
    super(s);
  }

  //////// Metodos

  /**
   * Get color
   * 
   * @return string
   */
  public String getColor() {
    return color;
  }

  
  /**
   * toString
   */
  @Override
  public String toString() {
    return super.toString() + " color = " + color;
  }
}
