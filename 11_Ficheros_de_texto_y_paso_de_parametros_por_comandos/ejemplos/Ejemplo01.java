
/**
 * Ejemplo01:
 * 
 * Ejemplo de uso de la clase File
 * Lectura de un fichero de texto
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo01 {
  public static void main(String[] args) {

    try {

      // Si se encuentra dentro de una carpeta se pone directorio/fichero.txt
      // y si no se pone fichero.txt
      BufferedReader br = new BufferedReader(new FileReader("ficheros/malaga.txt"));
      String linea = "";

      while (linea != null) {
        System.out.println(linea);
        linea = br.readLine();
      }

      br.close(); // Cerrar el fichero

    } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
      System.out.println("No se encuentra el fichero malaga.txt");
    } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
      System.out.println("No se puede leer el fichero malaga.txt");
    }
  }

}
