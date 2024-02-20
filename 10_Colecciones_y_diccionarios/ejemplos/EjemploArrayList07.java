/**
 * ArrayList de objetos:
 * creación y adición a la lista de objetos de la clase Gato.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.ArrayList;

public class EjemploArrayList07 {
  public static void main(String[] args) {

    ArrayList<Gato> g = new ArrayList<Gato>();

    g.add(new Gato("Garfield", "naranja", "mestizo"));
    g.add(new Gato("Pepe", "gris", "angora"));
    g.add(new Gato("Mauri", "blanco", "manx"));
    g.add(new Gato("Ulises", "marrón", "persa"));

    System.out.println("Datos de los gatos:");

    for (Gato gatoAux : g) {
      System.out.println(gatoAux);
    }
  }
}
