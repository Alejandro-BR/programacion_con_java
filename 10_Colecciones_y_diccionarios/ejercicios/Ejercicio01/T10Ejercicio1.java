/**
 * Ejercicio 1: Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio01;

import java.util.ArrayList;

public class T10Ejercicio1 {
  public static void main(String[] args) {
    ArrayList<String> compañeros = new ArrayList<>();

    compañeros.add("David");
    compañeros.add("Jose");
    compañeros.add("Luis");
    compañeros.add("Raquel");
    compañeros.add("Fernando");
    compañeros.add("Pablo");

    System.out.println("\nCompañeros: ");

    for (String nombres : compañeros) {
      System.out.println(nombres);
    }

    System.out.println();
  }
}
