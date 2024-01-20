/**
 * Ejercicio 10: Escribe un programa que genere 20 números enteros aleatorios
 * entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
 * si es necesario.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.InputMismatchException;

public class T07Ejercicio10 {
  public static void main(String[] args) {
    try {
      int numero[] = new int[20];
      int impar[] = new int[20];
      int par[] = new int[20];
      int aux;

      // Crear la array
      for (int i = 0; i < numero.length; i++) {
        aux = (int) (Math.random() * 101);
        if (aux % 2 == 0) {
          par[i] = aux;
        } else {
          impar[i] = aux;
        }
      }

      int contador = 0;

      for (int i = 0; i < numero.length; i++) {
        if (par[i] > 0) {
          numero[contador] = par[i];
          contador++;
        }
      }

      for (int i = 0; i < numero.length; i++) {
        if (impar[i] > 0) {
          numero[contador] = impar[i];
          contador++;
        }
      }

      for (int i = 0; i < numero.length; i++) {
        System.out.println(numero[i]);
      }

    } catch (InputMismatchException ime) {
      System.out.println(); // SALTO DE LINEA
      System.out.println("Introduciste letras en vez de numeros");
      System.out.println(); // SALTO DE LINEA
    } catch (Exception e) {
      System.out.println(); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
      System.out.println(); // SALTO DE LINEA
    }
  }
}

///////// Solucion del libro de Luis

// int[] n = new int[20];
// int[] par = new int[20];
// int[] impar = new int[20];
// int i;
// int pares = 0;
// int impares = 0;

// for (i = 0; i < 20; i++) {
// n[i] = (int)(Math.random() * 101);
// // Separa los números metiendo los pares en un array
// // y los impares en otro.
// if (n[i] % 2 == 0) {
// par[pares++] = n[i];
// } else {
// impar[impares++] = n[i];
// }
// }

// // Muestra el array original
// System.out.println("Array original:");
// for (i = 0; i < 20; i++) {
// System.out.print(n[i] + " ");
// }
// System.out.println();

// // Mete los pares en las primeras posiciones
// // del array original.
// for (i = 0; i < pares; i++) {
// n[i] = par[i];
// }

// // Mete los impares en los huecos que quedan.
// for (i = pares; i < 20; i++) {
// n[i] = impar[i - pares];
// }

// // Muestra el resultado.
// System.out.println("Array con los pares al principio:");
// for (i = 0; i < 20; i++) {
// System.out.print(n[i] + " ");
// }
