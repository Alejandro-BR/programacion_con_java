/**
 * Clase incidencia
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_18;

public class Incidencia {
  //////// Atributos
  private int codigo;
  private String estado;
  private int puesto;
  private String documentacion;
  private String solucion;
  //////// Atributos staticos
  private static int numeroIncidencias = 1;
  private static int pendientes = 0;

  ///////// Contructor
  public Incidencia(int puesto, String documentacion){
    this.codigo = numeroIncidencias;
    this.documentacion = documentacion;
    this.estado = "Pendiente";
    this.puesto = puesto;
    numeroIncidencias++;
    pendientes++;
  }

  //////// Metodos

  /**
   * Funcion que resuelve una incidencia
   * 
   * @param documentacion String
   */
  public void resuelve(String solucion){
    pendientes--;
    estado = "Resuelta";
    this.solucion = solucion;
  }

  /**
   * Get pendientes
   * 
   * @return int
   */
  public static int getPendientes() {
    return pendientes;
  }

  /**
   * toString
   * 
   * @return String
   * @return String - con la solucion
   */
  @Override
  public String toString() {
    if (estado.equals("Pendiente")) {
      return "Incidencia " + codigo + " - Puesto: " + puesto + " - "
      + documentacion + " - " +  estado + " ";
    } else {
      return "Incidencia " + codigo + " - Puesto: " + puesto + " - "
      + documentacion + " - " +  estado + " - " + solucion + " ";
    }
  }
  
}
