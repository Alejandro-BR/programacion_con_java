/**
 * Ejercicio 11: Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
 * del ejercicio anterior. El programa irá pidiendo que el usuario teclee
 * la traducción al inglés de cada una de las palabras y comprobará si son
 * correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
 * y cuántas erróneas.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio11;

import java.util.ArrayList;
import java.util.HashMap;

public class T10Ejercicio11 {
  public static void main(String[] args) {
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

    int i = 0;
    int numero;
    String[] a = diccionario.keySet().toArray(new String[0]); //Guarda las claves
    ArrayList<Integer> indice = new ArrayList<Integer>(); //Numeros aleatorios

    indice.add((int) (Math.random() * 20)); //Genera el primer numero aleatorio
    //Genera el resto de numeros aleatorios
    for (i = 0; i < 4; i++) {
      do {
        numero = (int) (Math.random() * 20);
      } while (indice.contains(numero));
      indice.add(numero);
    }

    System.out.println("\nText Ingles:\n");

    int puntos = 0;

    for (i = 0; i < 5; i++) {
      System.out.print(a[indice.get(i)] + ": ");
      String palabraIntro = System.console().readLine();
      if (palabraIntro.equals(diccionario.get(a[indice.get(i)]))) {
        System.out.println("\nRespuesta correcta 😎\n");
        puntos++;
      } else {
        System.out.println("\nRespuesta incorrecta 😓");
        System.out.println("La respuesta correcta es " + diccionario.get(a[indice.get(i)]) + "\n");
      }
    }

    System.out.println("Ha obtenido " + puntos + " puntos.\n");
  }
}
