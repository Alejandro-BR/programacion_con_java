/**
 * Clase abstracta mascota
 * 
 * De la que heredan perro y gato.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package clases;

public abstract class Mascota implements MascotaInterface {
  //////// Atributos
  private String chip;
  private String nombre;
  private int edad;
  private boolean vacunada = false;
  //////// Atributo statico
  private static int totalMascotas = 0;

  //////// Contructores

  /**
   * Contructor
   * 
   * Pide el atributo chip
   * y el atributo nombre
   * 
   * Aumenta el numero total de mascotas
   * 
   * @param chip   String
   * @param nombre String
   */
  public Mascota(String chip, String nombre) {
    this.chip = chip;
    this.nombre = nombre;
    totalMascotas++;
  }

  /**
   * Contructor
   * 
   * Pide el atributo chip
   * 
   * Aumenta el numero total de mascotas
   * 
   * @param chip String
   */
  public Mascota(String chip) {
    this.chip = chip;
    totalMascotas++;
  }

  //////// Metodos

  /**
   * Pasear la mascota.
   * 
   * Este metodo se implementa de la interface.
   */
  @Override
  public void pasear() {
    System.out.println("Estoy paseando, VIVA!");
  }

  /**
   * Vacunar a la mascota
   * vacunada false --> true
   */
  public void vacunar() {
    this.vacunada = true;
  }

  /**
   * Obtener el nombre
   * 
   * @return String
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Saber si esta vacunado
   * 
   * @return boolean
   */
  public boolean isVacunada() {
    return vacunada;
  }

  /**
   * Obtener el total de mascotas
   * 
   * @return int
   */
  public static int getTotalMascotas() {
    return totalMascotas;
  }

  /**
   * Obtener el chip
   * 
   * @return String
   */
  public String getChip() {
    return chip;
  }

  /**
   * Cambiar la edad
   * 
   * @param edad int
   */
  public void setEdad(int edad) {
    this.edad = edad;
  }

  /**
   * Obtener la edad
   * 
   * @return int
   */
  public int getEdad() {
    return edad;
  }

  /**
   * toString
   * 
   * [chip]: nombre, edad años
   */
  @Override
  public String toString() {
    return "[" + chip + "]: " + nombre + ", " + edad + " años";
  }
}
