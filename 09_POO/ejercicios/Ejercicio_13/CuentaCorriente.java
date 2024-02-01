/**
 * Clase CuentaCorriente
 * 
 * Ejercicio 13
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_13;

public class CuentaCorriente {
  //////// Atributos
  private String numero = "";
  private double saldo;
  //////// Variable auxiliares de la clase
  private String[] numeros = new String[1000];
  private int contador = 0;

  //////// Constructores

  /**
   * Constructor basico
   */
  public CuentaCorriente() {
    generarAleatorio();
    saldo = 0;
  }

  /**
   * Constructores dandole un saldo inicial
   * 
   * @param saldoInicial double
   */
  public CuentaCorriente(double saldoInicial) {
    generarAleatorio();
    this.saldo = saldoInicial;
  }

  /**
   * Genera el atributo numero aleatoriamente
   */
  private void generarAleatorio() {
    boolean repetido = false;
    do {

      // Dar el valor del numero
      for (int i = 0; i < 10; i++) {
        this.numero += (int) (Math.random() * 10); // Concatena 10 numeros al String
      }

      // Mirar si esta repetido
      for (int i = 0; i <= this.contador; i++) {
        if (this.numero == this.numeros[i]) {
          repetido = true;
        }
      }

      // Si no esta repetido se guarda en la array
      if (repetido == false) {
        this.contador++;
        this.numeros[contador] = this.numero;
      }

    } while (repetido == true);
  }

  //////// Metodos

  /**
   * 
   * @param cantidad double
   */
  public void ingreso(double cantidad) {
    this.saldo += cantidad;
  }

  /**
   * 
   * @param cantidad double
   */
  public void cargo(double cantidad) {
    this.saldo -= cantidad;
  }

  /**
   * 
   * @param destino  Objeto
   * @param cantidad double
   */
  public void transferencia(CuentaCorriente destino, double cantidad) {
    destino.saldo += cantidad; // Destino
    this.saldo -= cantidad; // Nosotros
  }

  /**
   * 
   * @return String
   */
  public String getNumero() {
    return numero;
  }

  /**
   * 
   * @return double
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * 
   * @return String
   */
  @Override
  public String toString() {
    return String.format("Numero de cta: %s \tSaldo: %.2f €", numero, saldo);
  }
}
