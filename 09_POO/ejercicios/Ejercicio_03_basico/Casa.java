/**
 * Clase Casa
 * 
 * Subclase de vivienda
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_03_basico;

public class Casa extends Vivienda {

  //////// Atributos
  private int metrosTerreno;

  //////// Contructores

  /**
   * Contructor completo
   * 
   * @param ubicacion     String
   * @param metros        int
   * @param habitaciones  int
   * @param metrosTerreno int
   */
  public Casa(String ubicacion, int metros, int habitaciones, int metrosTerreno) {
    super(ubicacion, metros, habitaciones);
    this.metrosTerreno = metrosTerreno;
  }

  /**
   * Contructor sin ubicacion
   * 
   * Ubicacion: Desconocida
   * 
   * @param metros        int
   * @param habitaciones  int
   * @param metrosTerreno int
   */
  public Casa(int metros, int habitaciones, int metrosTerreno) {
    super(metros, habitaciones);
    this.metrosTerreno = metrosTerreno;
  }

  /**
   * Conctrutor sin los atributos de vivienda
   * 
   * @param metrosTerreno int
   */
  public Casa(int metrosTerreno) {
    this.metrosTerreno = metrosTerreno;
  }

  /**
   * Conctructor basico
   */
  public Casa() {
  }

  //////// Metodos

  /**
   * Get de los metros del terreno
   * 
   * @return int
   */
  public int getMetrosTerreno() {
    return metrosTerreno;
  }

  /**
   * Cambiar los metros del terreno
   * 
   * @param metrosTerreno int
   */
  public void setMetrosTerreno(int metrosTerreno) {
    this.metrosTerreno = metrosTerreno;
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return super.toString() + " metros del terreno = " + metrosTerreno + " ";
  }

}
