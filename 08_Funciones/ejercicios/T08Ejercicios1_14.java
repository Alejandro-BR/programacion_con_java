
/**
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo esPrimo.
 * 
 * En este probare todas las funciones del 1 al 14:
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.Scanner;
import funciones.numeros;

public class T08Ejercicios1_14 {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc
      System.out.print("Introduce el numero: ");
      long numero = sc.nextLong();
      System.out.println("Numero de digitos: " + numeros.digitos(numero));
      sc.close(); // Cierre del Scanner
    } catch (Exception e) {
      System.out.println(""); //SALTO DE LINEA 
      System.out.println("Se producio un error: " + e.getMessage());
      System.out.println("Clase de error: " + e.getClass());
      System.out.println(""); //SALTO DE LINEA 
    }

  }

}