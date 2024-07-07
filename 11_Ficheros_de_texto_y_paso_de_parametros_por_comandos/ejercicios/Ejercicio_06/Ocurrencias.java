/**
 * Ejercicio 6:
 * 
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * El primer argumento sera la palabra a buscar.
 * Y el segundo argumento sera el fichero.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ocurrencias {

  /**
   * Lee por pantalla la palabra que se
   * quiere buscar.
   * 
   * @return String palabra
   */
  private static String leerPalabra() {
    System.out.print("\nIntroduce la palabra: ");
    String palabra = System.console().readLine();
    return palabra;
  }

  /**
   * Lee por pantalla el nombre del
   * fichero en el que se quiere buscar.
   * 
   * @return String nombre
   */
  private static String leerNombreFichero() {
    System.out.print("\nIntroduce el nombre del fichero: ");
    String nombre = System.console().readLine();
    return nombre;
  }

  public static void main(String[] args) {

    final String RUTA_BASE = "ejercicios\\Ejercicio_06\\";

    String linea = "";
    String palabra = "";
    String rutaFichero = RUTA_BASE;
    int i = 0;
    int repeticiones = 0;

    System.out.println("\nCuantas ocurrencias de una palabra hay en un fichero.");

    if (args.length == 2) {

      // Si se mandaron los parametros por linea de comando:
      palabra = args[0];
      rutaFichero += args[1];

    } else if (args.length == 0) {

      // Si no se mandaron los parametros por linea de comando:
      palabra = leerPalabra();
      rutaFichero += leerNombreFichero();

    } else {

      // Si se mandaron los parametros por linea de comando de manera incorrecta:
      System.out.println("No introduciste los parametros correctamente.");
      System.exit(0);
    }

    try {

      File fichero = new File(rutaFichero);
      BufferedReader br = new BufferedReader(new FileReader(fichero));

      while ((linea = br.readLine()) != null) {
        while ((i = linea.indexOf(palabra)) != -1) {
          linea = linea.substring(i + palabra.length(), linea.length());
          repeticiones++;
        }
      }

      System.out.println("\nLa palabra " + palabra + " aparece " + repeticiones + " veces.\n");

      br.close();

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    } catch (Exception e) {
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
    }

  }
}
