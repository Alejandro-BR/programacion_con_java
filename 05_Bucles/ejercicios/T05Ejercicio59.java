/**
 * Ejercicio 59: Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
 * que el usuario introduce una altura mayor o igual a 4.
 * 
 * Ejemplo 1:
 * 
 * Por favor, introduzca la altura del árbol: 7
 * 
 *     *
 *     ^
 *    ^ ^
 *   ^   ^
 *  ^     ^
 * ^^^^^^^^^
 *     Y
 * 
 * Ejemplo 2:
 * 
 * Por favor, introduzca la altura del árbol: 4
 * 
 *   *
 *   ^
 *  ^^^
 *   Y
 * 
 * Ejemplo 3:
 * 
 * Por favor, introduzca la altura del árbol: 10
 * 
 *        *
 *        ^
 *       ^ ^
 *      ^   ^
 *     ^     ^
 *    ^       ^
 *   ^         ^
 *  ^           ^
 * ^^^^^^^^^^^^^^^
 *        Y
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class T05Ejercicio59 {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(" "); // SALTO DE LINEA
      System.out.print("Por favor, introduzca la altura del árbol: ");
      int alturaIntroducida = sc.nextInt();
      System.out.println(" "); // SALTO DE LINEA

      sc.close(); // Cierre del Scanner

      int nivel = 2; // Variable que controla en que nivel estoy pintando, siendo 1 la estrella
      int espaciosPorDelante = alturaIntroducida - 1;
      int espaciosPorDentro = 0;

      // Estrella
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      System.out.println("*");

      //Hojas del arbol
      while (nivel < alturaIntroducida) {

        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }

        System.out.print("^");

        for (int i = 0; i < espaciosPorDentro; i++) {
          System.out.print(" ");
        }

        if (nivel == 2) {
          System.out.println("");
        } else {
          System.out.println("^");
        }

        espaciosPorDentro += 2; //En cada nivel pintamos 2 huecos mas
        nivel ++; //Aumentamos un nivel en la piramide
        espaciosPorDelante--;
      }

      //Bases de hojas del arbol

      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      for (int i = 1; i <= espaciosPorDentro + 2; i++) {
        System.out.print("^");
      }
      System.out.println(""); //SALTO DE LINEA 

      //Tronco del arbol
      espaciosPorDelante = alturaIntroducida - 1;

      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      System.out.println("Y");

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
