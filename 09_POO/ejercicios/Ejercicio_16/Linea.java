package Ejercicio_16;

public class Linea {
  //////// Atributos
  private Punto puntoInicial;
  private Punto puntoFinal;

  //////// Contructor
  public Linea(Punto puntoInicial, Punto puntoFinal) {
    this.puntoInicial = puntoInicial;
    this.puntoFinal = puntoFinal;
  }

  //////// Metodos

  /**
   * toString
   */
  @Override
  public String toString() {
    return "Linea --> puntoInicial = " + puntoInicial + ", puntoFinal = " + puntoFinal + " ";
  }
  
}
