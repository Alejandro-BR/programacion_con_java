/**
 * Ejercicio 4:
 * 
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class T11Ejercicio04 {
  public static void main(String[] args) {

    final String RUTA_BASE = "ejercicios\\Ejercicio_04\\";
    ArrayList<String> lineas = new ArrayList<>();
    String linea = "";

    if (args.length != 1) {
      System.out.println("Uso del programa: java T11Ejercicio04 FICHERO_ENTRADA");
      System.exit(0);
    }

    String rutaFichero = RUTA_BASE + args[0];
    // String rutaFichero = RUTA_BASE + "palabras.txt";

    try {

      // Copiar el fichero

      System.out.println("\nCopiando fichero...");

      File fichero = new File(rutaFichero);
      BufferedReader br = new BufferedReader(new FileReader(fichero));

      while ((linea = br.readLine()) != null) {
        lineas.add(linea);
    }
    

      br.close(); // Cerrar el fichero

      Collections.sort(lineas); // Ordenamos la lista

    System.out.println("Creando nuevo fichero ordenado...");

      // Creaccion del nuevo fichero:
      String rutaFicheroNuevo = RUTA_BASE + "NEW_" +  args[0];
      // String rutaFicheroNuevo = RUTA_BASE + "NEW_palabras.txt";
      File ficheroNuevo = new File(rutaFicheroNuevo);

      BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroNuevo));

      for (String li : lineas) {
        bw.write(li + "\n");
      }

      bw.close(); // Cerrar el fichero

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    } catch (Exception e) {
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
    }

    System.out.println("\nFichero nuevo creado.\n");

  }
}
