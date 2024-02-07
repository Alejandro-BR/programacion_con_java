/**
 * Clase TarjetaRegalo
 * 
 * @author Alejandro Barrionuevo Rosado
 */
package Ejercicio_11;

public class TarjetaRegalo {
  //////// Atributos
  private double saldo;
  private String numero;

  //////// Contructores
  /**
   * Creacion de una tarjeta regalo
   * 
   * @param saldo double
   */
  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    numero = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10)
        + (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 10);
  }

  /**
   * Creacion de una nueva tarjeta regalo uniendo dos tarjetas regalos
   * 
   * @param tarjeta1 Objeto de la clase TarjetaRegalo
   * @param tarjeta2 Objeto de la clase TarjetaRegalo
   */
  public TarjetaRegalo(TarjetaRegalo tarjeta1, TarjetaRegalo tarjeta2) {
    // Saldo de la tarjeta
    this.saldo = tarjeta1.saldo + tarjeta2.saldo;
    // Creacion del numero de tarjeta
    numero = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10)
        + (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 10);
    // Se ponen el saldo de las dos tarjetas a 0
    tarjeta1.saldo = 0;
    tarjeta2.saldo = 0;
  }

  //////// Metodos

  /**
   * Gastar saldo de la tarjeta
   * 
   * @param saldo double
   */
  public void gasta(double saldo) {
    if (this.saldo >= saldo) {
      this.saldo -= saldo;
    } else {
      System.out.println("No tiene suficiente saldo para gastar " + saldo);
    }
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return "TarjetaRegalo saldo = " + saldo + ", numero = " + numero + " ";
  }

}
