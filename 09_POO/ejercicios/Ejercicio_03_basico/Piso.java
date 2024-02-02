/**
 * Clase Piso
 * 
 * Subclase de vivienda
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_03_basico;

public class Piso extends Vivienda {

  //////// Atributos
  private int planta;
  private int numeroPuerta;

  //////// Contructores

  /**
   * Contructor completo
   * 
   * @param ubicacion    String
   * @param metros       int
   * @param habitaciones int
   * @param planta       int
   * @param numeroPuerta   int
   */
  public Piso(String ubicacion, int metros, int habitaciones, int planta, int numeroPuerta) {
    super(ubicacion, metros, habitaciones);
    this.planta = planta;
    this.numeroPuerta = numeroPuerta;
  }

  /**
   * Contructor sin ubicacion
   * 
   * Ubicacion: Desconocida
   * 
   * @param metros       int
   * @param habitaciones int
   * @param planta       int
   * @param numeroPuerta   int
   */
  public Piso(int metros, int habitaciones, int planta, int numeroPuerta) {
    super(metros, habitaciones);
    this.planta = planta;
    this.numeroPuerta = numeroPuerta;
  }

  /**
   * Conctrutor sin los atributos de vivienda
   * 
   * @param planta     int
   * @param numeroPuerta int
   */
  public Piso(int planta, int numeroPuerta) {
    this.planta = planta;
    this.numeroPuerta = numeroPuerta;
  }

  /**
   * Contructor basico
   */
  public Piso() {
  }

  //////// Metodos
  
  /**
   * Get planta
   * 
   * @return planta int
   */
  public int getPlanta() {
    return planta;
  }

  /**
   * Get numeroPuerta
   * 
   * @return numero de puerta int
   */
  public int getNumeroPuerta() {
    return numeroPuerta;
  }

  /**
   * Cambiar el numero de planta
   * 
   * @param planta int
   */
  public void setPlanta(int planta) {
    this.planta = planta;
  }

  /**
   * Cambiar el numero de puerta
   * 
   * @param numeroPuerta int
   */
  public void setNumeroPuerta(int numeroPuerta) {
    this.numeroPuerta = numeroPuerta;
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return super.toString() + " planta = " + planta + ", numero de la puerta = " + numeroPuerta + " ";
  }

}
