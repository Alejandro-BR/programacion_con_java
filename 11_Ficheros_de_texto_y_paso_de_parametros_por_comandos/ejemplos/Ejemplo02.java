/**
 * Ejemplo02:
 * 
 * Ejemplo de uso de la clase File
 * Calcula la media de los números que se encuentran en un fichero de texto
 * 
 * No funciona desde el run java de vs pero si desde el terminal :(
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo02 {
  public static void main(String[] args) {

    System.out.print("\nIntroduzca el nombre del archivo donde se encuentran los números: ");
    String nombreFichero = System.console().readLine();
    final String DIRECTORIO = "ficheros" + File.separator;

    File archivo = new File(DIRECTORIO + nombreFichero);
    if (!archivo.exists()) {
      System.out.println("El archivo no existe: " + DIRECTORIO + nombreFichero);
      return;
    }

    try {

      BufferedReader br = new BufferedReader(new FileReader(archivo));

      String linea;
      int i = 0;
      double suma = 0;

      while ((linea = br.readLine()) != null) {
        try {
          suma += Double.parseDouble(linea);
          i++;
        } catch (NumberFormatException nfe) {
          System.out.println("Línea no numérica encontrada y omitida: " + linea);
        }
      }

      i--;
      br.close();

      if (i > 0) {
        System.out.println("La media es " + suma / i);
      } else {
        System.out.println("No se encontraron números en el archivo.");
      }

    } catch (IOException ioe) {
      System.out.println("Error al leer el archivo: " + ioe.getMessage());
    }
  }
}