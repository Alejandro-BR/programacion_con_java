/**
 * Tabulacion:
 * 
 * Cambia los tabuladores por 2 espacios
 * 
 * Autor original:
 * @author Luis José Sánchez
 * 
 * Para ejecutarlo:
 * 
 * javac Tabulacion.java
 * java Tabulacion  EjemploTabulacion1.java  EjemploTabulacion2.java
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tabulacion {
  public static void main(String[] args) {

    // Itera sobre cada archivo proporcionado como argumento
    for (int i = 0; i < args.length; i++) {

      System.out.print("\nProcesando el archivo " + args[i] + "...");

      try {

        // Crea un objeto File para el archivo original
        File ficheroOriginal = new File(args[i]);
        // Crea un objeto File para el archivo temporal con el sufijo ".tmp"
        File ficheroTemporal = new File(args[i] + ".tmp");

        // Renombra el archivo original añadiendo ".tmp"
        ficheroOriginal.renameTo(ficheroTemporal);

        // Crea un BufferedReader para leer del archivo temporal
        BufferedReader bf = new BufferedReader(new FileReader(args[i] + ".tmp"));

        // Crea un BufferedWriter para escribir en un nuevo archivo con el nombre
        // original
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[i]));

        String linea = "";

        // Lee el archivo línea por línea
        while (linea != null) {
          linea = bf.readLine();
          if (linea != null) {
            // Reemplaza los tabuladores por 2 espacios
            linea = linea.replace("\t", "  ");
            // Escribe la línea modificada en el nuevo archivo
            bw.write(linea + "\n");
          }
        }

        // Cierra los flujos de lectura y escritura
        bf.close();
        bw.close();

        // Borra el archivo temporal
        ficheroTemporal.delete();

      } catch (IOException ioe) {
        // Maneja posibles excepciones de entrada/salida
        System.out.println("Se ha producido un error de lectura/escritura");
        System.err.println(ioe.getMessage());
      }

      System.out.println("\nProceso terminado.\n");
    }
  }
}
