/**
 * Ejercicio 52: Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
 * dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
 * queda igual.
 *
 * Ejemplo 1:
 * 
 * Introduzca un número: 609831
 * El número resultado es 98316
 * 
 * Ejemplo 2:
 * 
 * Introduzca un número: 78201345
 * El número resultado es 82013457
 * 
 * Ejemplo 3:
 * 
 * Introduzca un número: 24
 * El número resultado es 42
 * 
 * Ejemplo 4:
 * 
 * Introduzca un número: 8
 * El número resultado es 8
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.InputMismatchException; //catch ime
import java.util.Scanner; 

public class T05Ejercicio52 {
  public static void main(String[] args) {
    try {    
      Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
      sc.close(); //Cierre del Scanner 
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
