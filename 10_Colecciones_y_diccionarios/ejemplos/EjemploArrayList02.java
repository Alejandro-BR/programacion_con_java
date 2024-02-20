
/**
 * Ejemplo de uso de la clase ArrayList
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.ArrayList;

public class EjemploArrayList02 {
  public static void main(String[] args) {

    ArrayList<String> lista = new ArrayList<String>();

    System.out.println("Nº de elementos: " + lista.size()); // "size" ver el tamaño de la lista

    // Se añade 3 elementos
    lista.add("Rojo");
    lista.add("Verde");
    lista.add("Azul");
    lista.add("Blanco");
    lista.add("Amarillo");

    System.out.println("Contenido de las listas: ");

    for (int i = 0; i < lista.size(); i++) { // Size para mostrar el tamaño del array
      System.out.println(lista.get(i)); // Get para mostrar
    }

  }
}
