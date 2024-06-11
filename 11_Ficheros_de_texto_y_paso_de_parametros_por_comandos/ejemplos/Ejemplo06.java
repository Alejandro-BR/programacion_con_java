import java.io.File;

/**
 * Ejemplo06:
 * 
 * Ejemplo de uso de la clase File
 * Comprobación de existencia y borrado de un fichero
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Ejemplo06 {
  public static void main(String[] args) {

    System.out.print("\nIntroduzca el nombre del archivo que desea borrar: ");
    String nombreFichero = System.console().readLine();

    // El fichero tendria que estar en la carpeta principal del tema 11 para asi que funciones esto
    // si no habria que ponerla una ruta relativa.
    File fichero = new File(nombreFichero);

    // Seria asi o con una constante que quedaria mejor:
    // File fichero = new File("ejemplos\\ficheros\\" + nombreFichero);

    if (fichero.exists()) {
      fichero.delete();
      System.out.println("El fichero se ha borrado correctamente.\n");
    } else {
      System.out.println("El fichero " + nombreFichero + " no existe.\n");
    }
  }
}
