/**
 * Ejercicio 9: Realiza un programa que pida 8 números enteros y que luego
 * muestre esos números junto con la palabra “par” o “impar” según proceda.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.InputMismatchException;

public class T07Ejercicio09 {
  public static void main(String[] args) {
    try {
      int numero[] = new int[8];
      int copiaNumero[] = new int[8];

      System.err.println();
      for (int i = 0; i < numero.length; i++) {
        System.out.print("Introduce un numero entero: ");
        numero[i] = Integer.parseInt(System.console().readLine());
        if (numero[i] % 2 != 0) {
          copiaNumero[i] = numero[i];
        }
      }

      System.out.println();
      System.out.print("Numeros pares: ");
      for (int i = 0; i < numero.length; i++) {
        if (numero[i] % 2 == 0) {
          System.out.print(numero[i] + " ");
        }
      }

      System.out.println();

      System.out.print("Numero impares: ");
      for (int i = 0; i < copiaNumero.length; i++) {
        if (copiaNumero[i] > 0) {
          System.out.print(copiaNumero[i] + " ");
        }
      }
      System.out.println();
      System.out.println();

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
