/**
 * Clase Vehiculo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_02;

public abstract class Vehiculo {

  //////// Atributos
  private static int vehiculosCreados = 0;
  private static double kilometrosTotales = 0;
  private double kilometrosRecorridos = 0;

  //////// Contructor
  public Vehiculo() {
    vehiculosCreados++;
  }

  //////// Metodos

  /**
   * get kilometrosRecorridos
   * 
   * @return double
   */
  public double getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  /**
   * get VehiculosCreados
   * 
   * @return int
   */
  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  /**
   * get KilometrosTotales
   * 
   * @return double
   */
  public static double getKilometrosTotales() {
    return kilometrosTotales;
  }

  /**
   * Sumar los kilometros a los kilometros totales
   * 
   * @param kilometros double
   */
  public void sumarKilometrosTotales(double kilometros) {
    kilometrosTotales += kilometros;
  }

  /**
   * Andar con el vehiculo
   * 
   * @param kilometros double
   */
  public void andar(double kilometros) {
    this.kilometrosRecorridos += kilometros;  //suma los kilometros
    sumarKilometrosTotales(kilometros); //los paso a kilometrosTotales
  }
}
