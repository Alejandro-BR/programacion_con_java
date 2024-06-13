/**
 * Ejercicio 2:
 * 
 * Realiza un programa que lea el fichero creado en el ejercicio 
 * anterior y que muestre los números por pantalla.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class T11Ejercicio02 {
  public static void main(String[] args) {

    final String RUTA = "ejercicios\\Ejercicio_01\\primos.dat";
    String linea = "";

    try {

      File fichero = new File(RUTA);
      BufferedReader br = new BufferedReader(new FileReader(fichero));

      System.out.println("\nLectura del fichero primos.dat:");
      System.out.println("Numeros primos del 1 al 500:");

      while (linea != null) {
        System.out.println(linea);
        linea = br.readLine();
      }

      br.close();

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    }

    System.out.println();

  }
}
