/**
 * Ejercicio 1: Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_01_arrays;

public class AppGato {
  public static void main(String[] args) {
    Gato[] gatos = new Gato[4];

    for (int i = 0; i < gatos.length; i++) {
      System.out.print("\nIntroduce el nombre: ");
      String nombre = System.console().readLine(); 
      System.out.print("Introduce el color: ");
      String color = System.console().readLine(); 
      System.out.print("Introduce el sexo: ");
      String sexo = System.console().readLine(); 
      gatos[i] = new Gato(nombre, color, sexo);
    }

    System.out.println();
    for (Gato gato : gatos) {
      System.out.println(gato.toString());
    }
    System.out.println();
  }
}
