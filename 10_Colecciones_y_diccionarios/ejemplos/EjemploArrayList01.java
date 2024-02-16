/**
 * Ejemplo de uso de la clase ArrayList de String: metodos size, add y get
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.ArrayList;

public class EjemploArrayList01 {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();

    System.out.println("Nº de elementos: " + a.size()); //Al principio, no tendra elementos

    //Se añade 3 elementos
    a.add("rojo");
    a.add("verde");
    a.add("azul");

    System.out.println("Nº de elementos: " + a.size()); 

    a.add("blanco");

    System.out.println("Nº de elementos: " + a.size()); 

    System.out.println("El elemento que hay en la posicion 0 es " + a.get(0));
  }
}