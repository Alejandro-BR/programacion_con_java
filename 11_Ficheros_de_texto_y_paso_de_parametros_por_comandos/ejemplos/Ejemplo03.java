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
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo03 {
  public static void main(String[] args) {

    // Primero se escribe por pantalla por si acaso
    System.out.println("naranja");
    System.out.println("mango");
    System.out.println("chirimoya");
    // Despues se comprueba que es lo que queremos

    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("fruta.txt"));

      // Y ya se descomenta el codigo y se escribe en el fichero
      bw.write("naranja\n");
      bw.write("mango\n");
      bw.write("chirimoya\n");

      // Y lo mas importante se cierra el fichero
      bw.close();
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    }
  }
}
