/**
 * Ejercicio 40: Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca la altura del rombo: 5
 *   *
 *  * *
 * *   *
 *  * *
 *   *
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class T05Ejercicio40 {
  public static void main(String[] args) {
    try {

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); // SALTO DE LINEA
      System.out.print("Por favor, introduzca la altura del rombo: ");
      int altura = sc.nextInt();
      System.out.println(""); // SALTO DE LINEA

      sc.close(); // Cierre del Scanner

      int nivel = 1; // Variable que controla en que nivel estoy pintando, siendo 1 la cima de la piramide
      int espaciosPorDelante = altura - 1;
      int espaciosPorDentro = 0;

      int alturaMitad = altura - 2;

      // Pintamos la mitad del rombo es decir una piramide
      while (nivel < alturaMitad) {
        // Pintamos los espcaios por delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }

        // Pintamos el caracter
        System.out.print("*");

        // Pintamos los espacios por dentro
        for (int i = 1; i < espaciosPorDentro; i++) {
          System.out.print(" ");
        }

        // Pintamos el segundo caracter, excepto en el nivel 1
        if (nivel > 1) {
          System.out.print("*");
        }

        // Saltamos de linea
        System.out.println();

        espaciosPorDentro += 2; // En cada nivel pintamos 2 huecos mas
        nivel++; // Aumentamos un nivel en la piramide
        espaciosPorDelante--;

      }

      // Pintamos la otra mitad del rombo es decir una piramide invertida

      nivel = alturaMitad; // Variable que controla en que nivel estoy pintando empezamos por el mas alto

      while (nivel > 0) {
        // Pintamos los espcaios por delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }

        // Pintamos el caracter
        System.out.print("*");

        // Pintamos los espacios por dentro
        for (int i = 1; i < espaciosPorDentro; i++) {
          System.out.print(" ");
        }

        // Pintamos el segundo caracter, excepto en el nivel 1
        if (nivel > 1) {
          System.out.print("*");
        }

        // Saltamos de linea
        System.out.println();

        espaciosPorDentro -= 2; // En cada nivel pintamos 2 huecos mas
        nivel--; // Aumentamos un nivel en la piramide
        espaciosPorDelante++;

      }

      System.out.println(""); //SALTO DE LINEA  

    } catch (InputMismatchException ime) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("No se perimiten introducir caracteres o letras.");
      System.out.println(""); // SALTO DE LINEA
    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
