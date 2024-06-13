/**
 * Ejercicio 3:
 * 
 * Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
 * primeros dos ficheros mezcladas, es decir, la primera línea será del primer
 * fichero, la segunda será del segundo fichero, la tercera será la siguiente del
 * primer fichero, etc.
 * 
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
 * pasar como argumentos en la línea de comandos.
 * 
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
 * pueden tener tamaños diferentes.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class T11Ejercicio03 {

  private static final String RUTA_BASE = "ejercicios\\Ejercicio_03\\";
  private static final String DESTINO = "destino";
  private static final String PRIMERO = "primer";
  private static final String SEGUNDO = "segundo";

  /**
   * leerPorPantalla:
   * 
   * Funcion que manda un mensaje personalizado
   * dependiendo el fichero que pidamos y que devuelve
   * el nombre del fichero.
   * 
   * @param nombre String
   * @return string
   */
  private static String leerPorPantalla(String nombre) {
    if (nombre.equals(DESTINO)) {
      System.out.print("\nIntroduce el nombre del fichero de " + nombre + ": ");
    } else {
      System.out.print("\nIntroduce el nombre del " + nombre + " fichero de origen: ");
    }

    return System.console().readLine();
  }

  public static void main(String[] args) {

    // Rutas
    String rutaPrimerFichero = RUTA_BASE + leerPorPantalla(PRIMERO);
    String rutaSegundoFichero = RUTA_BASE + leerPorPantalla(SEGUNDO);
    String rutaFicheroDestino = RUTA_BASE + leerPorPantalla(DESTINO);

    try {

      // Ficheros
      File primerFichero = new File(rutaPrimerFichero);
      File segundoFichero = new File(rutaSegundoFichero);
      File ficheroDestino = new File(rutaFicheroDestino);

      // Trabajar con los ficheros
      BufferedReader brPrimero = new BufferedReader(new FileReader(primerFichero));
      BufferedReader brSegundo = new BufferedReader(new FileReader(segundoFichero));
      BufferedWriter bwDestino = new BufferedWriter(new FileWriter(ficheroDestino));

      String linea1 = "";
      String linea2 = "";

      while ((linea1 != null) && (linea2 != null)) {

        linea1 = brPrimero.readLine();
        linea2 = brSegundo.readLine();

        if (linea1 != null) {
          // System.out.println(linea1 + "\n");
          bwDestino.write(linea1 + "\n");
        }

        if (linea2 != null) {
          // System.out.println(linea2 + "\n");
          bwDestino.write(linea2 + "\n");
        }
      }

      // Cerrar los ficheros
      brPrimero.close();
      brSegundo.close();
      bwDestino.close();

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    }

    System.out.println("\nFichero escrito con el contenido de los de origen.\n");

  }
}