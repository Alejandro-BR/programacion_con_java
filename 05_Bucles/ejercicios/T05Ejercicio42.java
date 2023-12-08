
/**
 * Ejercicio 42: Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo o no.
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca un número entero positivo: 17
 * 17 es primo
 * 18 no es primo
 * 19 es primo
 * 20 no es primo
 * 21 no es primo
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class T05Ejercicio42 {
  public static void main(String[] args) {
    try {
      boolean primo = true;
      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc
      System.out.println(""); // SALTO DE LINEA
      System.out.print("Por favor, introduzca un número entero positivo: ");
      int numero = sc.nextInt();
      sc.close(); // Cierre del Scanner
      for (int i = numero; i <= numero + 4; i++) {
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            // NO ES PRIMO
            primo = false;
            break;
          } else if (i % j != 0) {
            // ES PRIMO
            primo = true;
          }
        }
        if (primo == true) {
          System.out.println(i + " es primo");
        } else {
          System.out.println(i + " no es primo");
        }
      }
      System.out.println(""); // SALTO DE LINEA

    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Error de mensaje: " + e.getMessage());
      System.out.println("Clase de excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
