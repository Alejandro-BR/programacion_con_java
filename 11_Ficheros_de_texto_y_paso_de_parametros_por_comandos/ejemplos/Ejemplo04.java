/**
 * Ejemplo04:
 * 
 * Ejemplo de uso de la clase File
 * Mezcla de dos ficheros
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo04 {
  public static void main(String[] args) {

    try {

      // Rutas relativas
      final String RUTA_FICHERO1 = "ejemplos\\ficheros\\fichero1.txt";
      final String RUTA_FICHERO2 = "ejemplos\\ficheros\\fichero2.txt";
      final String RUTA_MEZCLA = "ejemplos\\ficheros\\mezcla.txt";

      // Crear el objeto File con la ruta especificada
      File fichero1 = new File(RUTA_FICHERO1);
      File fichero2 = new File(RUTA_FICHERO2);
      File mezcla = new File(RUTA_MEZCLA);

      // Leer los ficheros
      BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
      BufferedReader br2 = new BufferedReader(new FileReader(fichero2));

      // Escribir en el fichero
      BufferedWriter bw = new BufferedWriter(new FileWriter(mezcla));

      String linea1 = "";
      String linea2 = "";

      while ((linea1 != null) || (linea2 != null)) {
        linea1 = br1.readLine();
        linea2 = br2.readLine();
        if (linea1 != null) {
          bw.write(linea1 + "\n");
        }
        if (linea2 != null) {
          bw.write(linea2 + "\n");
        }
      }

      // Cerrar los ficheros
      br1.close();
      br2.close();
      bw.close();

      System.out.println("Archivo mezcla.txt creado satisfactoriamente.");

    } catch (IOException ioe) {
      System.out.println("Se ha producido un error de lectura/escritura");
      System.err.println(ioe.getMessage());
    }
  }
}
