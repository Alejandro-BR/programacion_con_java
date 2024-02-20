/**
 * Ejemplo con objetos
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.ArrayList;


public class EjemploArrayList09 {
  public static void main(String[] args) {
    ArrayList<Gato> camada = new ArrayList<Gato>();

    camada.add(new Gato("Michifu", "Naranja", "Persa", "Macho", 3, 15.6));
    camada.add(new Gato("Garfield", "Gris", "Romano", "Macho", 2, 15.6));

    System.out.println("Listado de gatos:");
    for (Gato gato : camada) {
      System.out.println(gato);
    }
  }
}
