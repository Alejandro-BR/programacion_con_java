/**
 * Ejercicio 10: Escribe un programa que genere 20 números enteros aleatorios
 * entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
 * si es
 * necesario.
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

      //Crear la array
      for (int i = 0; i < numero.length; i++) {
        aux = (int)(Math.random()*101);
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
