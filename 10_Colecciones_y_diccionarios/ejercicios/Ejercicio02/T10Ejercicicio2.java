/**
 * Ejercicio 2: Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio02;

import java.util.ArrayList;
import java.util.Collections;

public class T10Ejercicicio2 {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();
    int tamano = (int) (Math.random()*11)+20;
    int suma = 0;

    for (int i = 0; i < tamano; i++) {
      int numero = (int) (Math.random()*101);
      numeros.add(numero);
      suma += numero;
    }

    System.out.println("\nNumeros: ");
    System.out.println(numeros);

    Collections.sort(numeros); //ordenar los numeros de menor a mayor

    System.out.println("\nMedia: " + suma/numeros.size()); 
    System.out.println("Suma: " + suma);
    System.out.println("Maximo: " + numeros.get(tamano - 1));
    System.out.println("Minimo: " + numeros.get(0) + "\n");
  }
}
