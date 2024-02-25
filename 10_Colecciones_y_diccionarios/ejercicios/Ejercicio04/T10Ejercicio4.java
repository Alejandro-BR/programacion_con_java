/**
 * Ejercicio 4:Realiza un programa equivalente al anterior pero en esta ocasión, 
 * el programa debe ordenar palabras en lugar de números.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio04;

import java.util.ArrayList;
import java.util.Collections;

public class T10Ejercicio4 {
  public static void main(String[] args) {
    ArrayList<String> palabras = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      System.out.print("\nIntroduce una palabra: ");
      String palabra = System.console().readLine(); 
      palabras.add(palabra);
    }

    Collections.sort(palabras); //ordenar
    /**
     * Lo ordena de esta forma:
     * 
     * Primero simbolos
     * Segundo numeros
     * Tercero letras en mayusculas
     * Cuarto letras en minuscula
     */

    System.out.println("\n" + palabras + "\n");

  }
}
