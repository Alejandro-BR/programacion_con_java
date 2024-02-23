/**
 * Clase Gato
 * 
 * Hereda de la clase Mascota.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package clases;

public class Gato extends Mascota {
  //////// Atributos
  private String pelaje;
  //////// Atributo statico
  private static int totalGatos = 0;

  //////// Contructores
  /**
   * Contructor
   * 
   * Llama al contructor del padre
   * y aumenta el contador de gatos.
   * 
   * @param chip   String
   * @param nombre String
   */
  public Gato(String chip, String nombre) {
    super(chip, nombre);
    totalGatos++;
  }

  /**
   * Contructor
   * 
   * Llama al contructor del padre
   * y aumenta el contador de gatos.
   * 
   * @param chip String
   */
  public Gato(String chip) {
    super(chip);
    totalGatos++;
  }

  //////// Metodos

  /**
   * Hacer que el gato maulle.
   */
  public void maullar() {
    System.out.println("¡Miaaaaauuuuuu! Brrrrr…");
  }

  /**
   * Hacer que el gato bufe.
   */
  public void bufar() {
    System.out.println("Fuuuuuu…");
  }

  /**
   * Pasear al gato.
   */
  @Override
  public void pasear() {
    if (!isVacunada()) {
      System.out.println(getNombre() + " no puede pasear hasta no estar vacunado/a");
    } else {
      maullar();
    }
  }

  /**
   * Vacunar al gato
   * vacunada false --> true
   */
  @Override
  public void vacunar() {
    if (isVacunada()) {
      System.out.println(getNombre() + " se encuentra vacunado/a.");
    } else {
      super.vacunar();
      bufar();
    }
  }

  /**
   * Obtener el numero total de gatos
   * 
   * @return int
   */
  public static int getTotalGatos() {
    return totalGatos;
  }

  /**
   * Etablece el pelaje
   * 
   * @param pelaje String
   */
  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }

  /**
   * Ver el pelaje
   * 
   * @return String
   */
  public String getPelaje() {
    return pelaje;
  }

}
