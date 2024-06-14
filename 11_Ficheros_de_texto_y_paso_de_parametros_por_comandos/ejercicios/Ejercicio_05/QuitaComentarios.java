/**
 * Ejercicio 5:
 * 
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * 
 * Se utilizaría de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * 
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * 
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero
 * sin los comentarios.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class QuitaComentarios {
  public static void main(String[] args) {

    // String[] prueba = new String[2];
    // prueba[0] = "Hola.java";
    // prueba[1] = "HolaSinComentarios.java";

    final String RUTA_BASE = "ejercicios\\Ejercicio_05\\";
    String linea = "";

    if (args.length != 2) {
      System.out.println("Uso del programa: java T11Ejercicio04 FICHERO_ENTRADA");
      System.exit(0);
    }

    String rutaFichero = RUTA_BASE + args[0];
    String rutaFicheroNuevo = RUTA_BASE + args[1];
    // String rutaFichero = RUTA_BASE + prueba[0];
    // String rutaFicheroNuevo = RUTA_BASE + prueba[1];
    String nombreClase = args[1].replaceAll("\\.java$", "");
    // String nombreClase = prueba[1].replaceAll("\\.java$", "");

    System.out.println("\nIniciando el programa:");

    try {

      File ficheroOriginal = new File(rutaFichero);
      File ficheroNuevo = new File(rutaFicheroNuevo);

      BufferedReader br = new BufferedReader(new FileReader(ficheroOriginal));
      BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroNuevo));

      System.out.println("Creando la nueva clase...");

      while ((linea = br.readLine()) != null) {
        if (linea.contains("public class" )) { 
          bw.write("public class " + nombreClase + " {");
        } else if (!linea.contains("//")) {
          bw.write(linea + "\n");
        }
      }

      bw.close();
      br.close();

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    } catch (Exception e) {
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
    }

    System.out.println("Clase creada con exito\n");

  }
}
