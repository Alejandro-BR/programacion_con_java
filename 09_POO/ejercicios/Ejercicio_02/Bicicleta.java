/**
 * SubClase Bicicleta
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_02;

public class Bicicleta extends Vehiculo {
    //////// Atributos

  //////// Contructor

  //////// Metodos

  /**
   * Andar con la bicicleta
   * 
   * @param kilometros double
   */
  @Override
  public void andar(double kilometros) {
    super.andar(kilometros);
    System.out.println("La bicicleta ando " + kilometros + " kilometros");
  }

  public void Caballito(){
    System.out.println("Hace el caballito con la bicicleta");
  }
}
