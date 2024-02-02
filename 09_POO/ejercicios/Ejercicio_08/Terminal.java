/**
 * Clase Terminal
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_08;

public class Terminal {
  /////// Atributos
  private String numero;
  private int tiempoConversacion;  //en segundos

  /////// Contructor

  /**
   * Contructor que pide el numero
   * 
   * @param numero String
   */
  public Terminal(String numero){
    this.numero = numero;
  }

  /////// Metodos

  /**
   * Get Numero
   * 
   * @return String
   */
  public String getNumero() {
    return numero;
  }

  /**
   * Get tiempo de la conversacion
   * 
   * @return int
   */
  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  /**
   * Modificar el numero
   * 
   * @param numero String
   */
  public void setNumero(String numero) {
    this.numero = numero;
  }

  /**
   * Moficar el tiempo
   * 
   * @param tiempoConversacion int
   */
  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return "Nº " +  numero + " - " + tiempoConversacion + "s de conversación ";
  }

  /**
   * Metodo llamar
   * 
   * @param t Objeto Terminal
   * @param tiempoConversacion int
   */
  public void llama(Terminal t, int tiempoConversacion){
    this.tiempoConversacion += tiempoConversacion;
    t.tiempoConversacion += tiempoConversacion;
  }
  
}
