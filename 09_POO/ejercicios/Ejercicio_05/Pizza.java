/**
 * Clase Pizza
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_05;

public class Pizza {
  //////// Atributos
  private Tipo tipo;
  private Tamano tamano; // tamaño
  private static int TotalServidas = 0;
  private static int TotalPedidas = 0;
  private boolean pedida;

  //////// Contructor
  /**
   * Contructor de la clase Pizza
   * 
   * @param tipo   Enum Tipo
   * @param tamano Enum tamano
   *               pedida = true
   */
  public Pizza(Tipo tipo, Tamano tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.pedida = true;
    TotalPedidas++;
  }

  //////// Metodos

  /**
   * Pedir una pizza
   */
  public void sirve(){
    TotalServidas++; 
    this.pedida = false;
    System.out.println("esa pizza ya se ha servido");
  }

  /**
   * Numeros de pizzas servidas
   * 
   * @return int
   */
  public static int getTotalServidas() {
    return TotalServidas;
  }

  /**
   * Numeros de pizzas pedidas
   * 
   * @return int 
   */
  public static int getTotalPedidas() {
    return TotalPedidas;
  }

  /**
   * toString
   */
  @Override
  public String toString() {

    //Tamaño
    String tam;
    switch (tamano) {
      case FAMILIAR:
        tam = "familiar";
        break;
      default:
      tam = "mediana";
        break;
    }

    //Tipo
    String tip;
    switch (tipo) {
      case MARGARITA:
        tip = "margarita";
        break;
        case CUATRO_QUESOS:
        tip = "cuatro quesos";
        break;
      default:
        tip = "funghi";
        break;
    }

    if (pedida) {
      return "Pizza " + tip + " " + tam + " pedida";
    } else{
      return "Pizza " + tip + " " + tam + " servida";
    }
  }


  

}
