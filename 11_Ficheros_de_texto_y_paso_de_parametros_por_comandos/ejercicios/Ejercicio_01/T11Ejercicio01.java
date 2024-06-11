/**
 * Ejercicio 1:
 * 
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class T11Ejercicio01 {

  /**
   * Comprueba si un numero es primo:
   * 
   * @param numero int
   * @return boolean 
   * 
   * true --> el numero es positivo
   * false --> el numero es negativo
   */
  public static boolean esPrimo(int numero) {

    if (numero < 2) {
      return false;
    }

    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {

    final String FICHERO = "ejercicios\\Ejercicio_01\\primos.dat";
    final int LIMITE = 500;

    try {

      File primos = new File(FICHERO);
      BufferedWriter bw = new BufferedWriter(new FileWriter(primos));

      System.out.println(("\nEstos son los numeros primos entre 1-500: \n"));

      for (int i = 0; i < LIMITE; i++) {
        if (esPrimo(i)) {
          System.out.println(i + "\n");
          bw.write(i + "\n");
        }
      }

      bw.close();

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    }
  }
}
