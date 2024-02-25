/**
 * Ejercicio 3: Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio02;

import java.util.ArrayList;
import java.util.Collections;

public class T10Ejercicio3 {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      System.out.print("\nIntroduce un numero: ");
      numeros.add(Integer.parseInt(System.console().readLine()));
    }

    System.out.println("\n" + numeros);

    Collections.sort(numeros); //ordenar

    System.out.println(numeros + "\n");
  }
}
