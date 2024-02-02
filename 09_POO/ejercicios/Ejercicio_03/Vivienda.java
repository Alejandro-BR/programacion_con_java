/**
 * Ejercicio 3
 * 
 * Clase Vivienda
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_03;

public class Vivienda {

  //////// Atributos
  private String ubicacion;
  private int metros;
  private int habitaciones;

  //////// Contructores

  /**
   * Contructor completo
   * 
   * @param ubicacion    String
   * @param metros       int
   * @param habitaciones int
   */
  public Vivienda(String ubicacion, int metros, int habitaciones) {
    this.ubicacion = ubicacion;
    this.metros = metros;
    this.habitaciones = habitaciones;
  }

  /**
   * Contructor sin ubicacion
   * 
   * Ubicacion: Desconocida
   * 
   * @param metros       int
   * @param habitaciones int
   */
  public Vivienda(int metros, int habitaciones) {
    this.metros = metros;
    this.habitaciones = habitaciones;
    this.ubicacion = "Desconocida";
  }

  /**
   * Contructor basico
   */
  public Vivienda() {
  }

  //////// Metodos

  /**
   * Get de ubicacion
   * 
   * @return String
   */
  public String getUbicacion() {
    return ubicacion;
  }

  /**
   * Get de metros
   * 
   * @return int
   */
  public int getMetros() {
    return metros;
  }

  /**
   * Get de habitaciones
   * 
   * @return int
   */
  public int getHabitaciones() {
    return habitaciones;
  }

  /**
   * Cambiar la ubicacion
   * 
   * @param ubicacion String
   */
  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  /**
   * Modificar el tamaño
   * 
   * @param metros int
   */
  public void setMetros(int metros) {
    this.metros = metros;
  }

  /**
   * Aumentar o disminuir el numero de de habitaciones
   * 
   * @param habitaciones int 
   */
  public void setHabitaciones(int habitaciones) {
    this.habitaciones = habitaciones;
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return "Ubicacion = " + ubicacion + ", metros = " + metros + ", habitaciones = " + habitaciones + " ";
  }


}
