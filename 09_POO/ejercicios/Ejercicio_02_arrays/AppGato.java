/**
 * Ejercicio 2: Cambia el programa anterior de tal forma que los datos de los gatos se
 * introduzcan directamente en el código de la forma gatito[2].setColor("marrón") o
 * bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja",
 * "macho"). Muestra a continuación los datos de todos los gatos utilizando un bucle.
 *
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_02_arrays;

public class AppGato {
  public static void main(String[] args) {
    Gato[] gatos = new Gato[4];

    gatos[0] = new Gato("Noa", "Marron, blanco y negro", "Hembra");
    gatos[1] = new Gato("Mini", "Marron", "Hembra");
    gatos[2] = new Gato("Manchista", "Gris y blanco", "Macho");
    gatos[3] = new Gato("Tigre", "Gris y blanco", "Macho");

    System.out.println();
    for (Gato gato : gatos) {
      System.out.println(gato.toString());
    }
    System.out.println();
  }
}
