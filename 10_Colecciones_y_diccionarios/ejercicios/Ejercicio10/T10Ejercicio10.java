/**
 * Ejercicio 10: Crea un mini-diccionario español-inglés que contenga, al menos, 
 * 20 palabras (con su correspondiente traducción). 
 * Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras.
 * El programa pedirá una palabra en español y dará la correspondiente traducción en inglés.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio10;

import java.util.HashMap;

public class T10Ejercicio10 {
  public static void main(String[] args) {
    boolean salir = false;
    // Diccionario
    HashMap<String, String> diccionario = new HashMap<String, String>();

    diccionario.put("Hola", "Hello");

    diccionario.put("Rojo", "Red");
    diccionario.put("Amarillo", "Yellow");
    diccionario.put("Azul", "Blue");
    diccionario.put("Naranja", "Orange");
    diccionario.put("Rosa", "Pink");
    diccionario.put("Verde", "Green");
    diccionario.put("Morado", "Purple");
    diccionario.put("Marrón", "Brown");
    diccionario.put("Celeste", "Sky Blue");
    diccionario.put("Negro", "Black");
    diccionario.put("Blanco", "White");
    diccionario.put("Gris", "Gray");

    diccionario.put("Perro", "Dog");
    diccionario.put("Gato", "Cat");
    diccionario.put("Lagarto", "Lizard");
    diccionario.put("Pajaro", "Bird");
    diccionario.put("Tortuga", "Tortoise");
    diccionario.put("Leon", "Lion");
    diccionario.put("Oso", "Bear");

    System.out.println("\nDiccionario:\n");

    for (String palabra : diccionario.keySet()) {
      System.out.println(palabra + " - " + diccionario.get(palabra));
    }

    do {
      System.out.print("\nIntroduce la palabra en español: ");
      String palabra = System.console().readLine();

      System.out.println("\n" + diccionario.get(palabra));

      System.out.print("\nQuieres introducir otra palabra [ 1 - si | 2 - no ]: ");
      int menu = Integer.parseInt(System.console().readLine());

      if (menu == 2) {
        salir = true;
      }

    } while (!salir);

    System.out.println("\nGracias.\n");
  }
}
