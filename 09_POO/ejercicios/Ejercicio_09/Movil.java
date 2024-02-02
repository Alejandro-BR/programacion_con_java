/**
 * SubClase Movil
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_09;

public class Movil extends Terminal {

  /////// Atributos
  private String tarifa;
  private Double totalGastado;

  /////// Contructor

  /**
   * Contructor de la clase Movil
   * 
   * @param numero String
   * @param tarifa String
   *               totalGastado = 0
   */
  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.totalGastado = 0.0;
  }

  /////// Metodos

  /**
   * Metodo llamar
   * 
   * @param t Movil
   * @param tiempoConversacion int
   */
  @Override
  public void llama(Terminal t, int tiempoConversacion) {
    super.llama(t, tiempoConversacion);
    double minutos = (double) tiempoConversacion / 60;
    switch (this.tarifa) {
      case "rata":
        totalGastado += minutos * 0.06;
        break;
      case "mono":
        totalGastado += minutos * 0.12;
        break;
      case "bisonte":
        totalGastado += minutos * 0.30;
        break;
      default:
        break;
    }
  }

  @Override
  public String toString(){
    return super.toString() + String.format(" - tarificados %.2f euros ", totalGastado);
  }

}
