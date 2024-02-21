/**
 * Ejercicico 18: Una empresa quiere implementar un programa que lleve el control de las
 * incidencias que se producen en sus ordenadores. Cada incidencia tiene un
 * código: 1, 2, 3, 4, etc. Cuando se crea una nueva incidencia, se le asigna
 * un código de forma automática y se pone el estado como “pendiente”. Al
 * crear una incidencia hay que indicar también el número de puesto (un número
 * entero). Cuando se resuelve una incidencia, hay que proporcionar información
 * sobre cómo se ha resuelto o qué es lo que fallaba, además, el estado pasa a
 * “resuelta”. El siguiente trozo de código que va dentro del main genera la salida
 * que se muestra a continuación.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_18;

public class T09Ejercicio18 {
  public static void main(String[] args) {
    Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
    Incidencia inc2 = new Incidencia(14, "No arranca");
    Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
    Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño");
    Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
    inc2.resuelve("El equipo no estaba enchufado");
    inc3.resuelve("Cambio del cable VGA");
    System.out.println(inc1);
    System.out.println(inc2);
    System.out.println(inc3);
    System.out.println(inc4);
    System.out.println(inc5);
    System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
  }
}
