/**
 * Ejemplo05:
 * 
 * Ejemplo de uso de la clase File
 * Listado de los archivos del directorio actual
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.io.File;

public class Ejemplo05 {
  public static void main(String[] args) {
    File f = new File("."); // se indica la ruta entre comillas
    // el punto (.) es el directorio actual

    String[] listaArchivos = f.list();

    for (String nombreArchivo : listaArchivos) {
      System.out.println(nombreArchivo);
    }
  }
}
