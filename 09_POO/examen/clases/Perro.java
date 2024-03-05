/**
 * Claso Perro
 * 
 * Hereda de la clase Mascota.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package clases;

public class Perro extends Mascota {
  //////// Atributos
  private String raza;
  //////// Atributo statico
  private static int totalPerros = 0;

  //////// Contructores
  /**
   * Contructor
   * 
   * Llama al contructor del padre
   * y aumenta el contador de perros.
   * 
   * @param chip   String
   * @param nombre String
   */
  public Perro(String chip, String nombre) {
    super(chip, nombre);
    totalPerros++;
  }

  /**
   * Contructor
   * 
   * Llama al contructor del padre
   * y aumenta el contador de perros.
   * 
   * @param chip String
   */
  public Perro(String chip) {
    super(chip);
    totalPerros++;
  }

  //////// Metodos

  /**
   * Hacer que el perro ladre.
   */
  public void ladrar() {
    System.out.println("¡Guau! ¡Guau!");
  }

  /**
   * Hacer que el perro gruña.
   */
  public void gurnir() {
    System.out.println("Grrrrr...");
  }

  /**
   * Pasear al perro.
   */
  @Override
  public void pasear() {
    if (isVacunada()) {
      ladrar();
    } else {
      System.out.println(getNombre() + " no puede pasear hasta no estar vacunado/a.");
    }
  }

  /**
   * Vacunar al perro
   * vacunada false --> true
   */
  @Override
  public void vacunar() {
    if (isVacunada()) {
      System.out.println(getNombre() + " se encuentra vacunado/a.");
    } else {
      super.vacunar();
      gurnir();
    }
  }

  /**
   * Obtener el numero total de perros
   * 
   * @return int
   */
  public static int getTotalPerros() {
    return totalPerros;
  }

  /**
   * Establecer la raza
   * 
   * @param raza
   */
  public void setRaza(String raza) {
    this.raza = raza;
  }

  /**
   * Saber la raza
   * 
   * @return String
   */
  public String getRaza() {
    return raza;
  }

}
