/**
 * Ejemplo03:
 * 
 * Ejemplo de uso de la clase File
 * Escritura en un fichero de texto
 * 
 * Hay que tener en cuenta que es muy importante
 * cerrar con el bw.close(); porque si no peligra el equipo. 
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo03 {
  public static void main(String[] args) {

    // Primero se escribe por pantalla por si acaso
    System.out.println("naranja");
    System.out.println("mango");
    System.out.println("chirimoya");
    System.out.println("platano");
    // Después se comprueba que es lo que queremos

    try {
      // Definir la ruta del archivo
      String rutaArchivo = "ejemplos\\ficheros\\fruta.txt";

      // Crear el objeto File con la ruta especificada
      File archivo = new File(rutaArchivo);

      // Imprimir la ruta absoluta para verificación
      System.out.println("Ruta absoluta del archivo: " + archivo.getAbsolutePath());

      // Crear el BufferedWriter para escribir en el archivo
      BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));

      // Y ya se descomenta el código y se escribe en el fichero
      bw.write("naranja\n");
      bw.write("mango\n");
      bw.write("chirimoya\n");
      bw.write("platano\n");

      // Y lo más importante se cierra el fichero
      bw.close();
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    }
  }
}
