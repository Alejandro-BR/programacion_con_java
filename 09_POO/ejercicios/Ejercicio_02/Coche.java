/**
 * SubClase Coches
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_02;

public class Coche extends Vehiculo {

  //////// Atributos

  //////// Contructor

  //////// Metodos

  /**
   * Andar con el coche
   * 
   * @param kilometros double
   */
  @Override
  public void andar(double kilometros) {
    super.andar(kilometros);
    System.out.println("El coche ando " + kilometros + " kilometros");
  }

  /**
   * Quemar rueda
   */
  public void quemarRueda() {
    System.out.println("Burrun-burrun");
  }

}
