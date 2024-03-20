/**
 * Ejercicio 16
 * Realiza un programa que sepa decir la capital de un país (en caso de conocer
 * la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
 * principio, el programa solo conoce las capitales de España, Portugal y Francia.
 * Estos datos deberán estar almacenados en un diccionario. Los datos sobre
 * capitales que vaya aprendiendo el programa se deben almacenar en el mismo
 * diccionario. El usuario sale del programa escribiendo la palabra “salir”.
 * 
 * Ejemplo:
 * 
 * Escribe el nombre de un país y te diré su capital: España
 * La capital de España es Madrid
 * Escribe el nombre de un país y te diré su capital: Alemania
 * No conozco la respuesta ¿cuál es la capital de Alemania?: Berlín
 * Gracias por enseñarme nuevas capitales
 * Escribe el nombre de un país y te diré su capital: Portugal
 * La capital de Portugal es Lisboa
 * Escribe el nombre de un país y te diré su capital: Alemania
 * La capital de Alemania es Berlín
 * Escribe el nombre de un país y te diré su capital: Francia
 * La capital de Francia es París
 * Escribe el nombre de un país y te diré su capital: salir
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio16;

import java.util.HashMap;

public class T10Ejercicio16 {
  public static void main(String[] args) {
    HashMap<String, String> paises = new HashMap<>();
    paises.put("Espana", "Madrid"); // España
    paises.put("Francia", "Paris");
    paises.put("Japon", "Tokyo");
    paises.put("Alemania", "Berlin");
    paises.put("Italia", "Roma");
    paises.put("Grecia", "Atenas");
    paises.put("Portugal", "Lisboa");

    String pais = "";
    String capital;
    Boolean vacio;

    do {
      // Declaracion del booleano
      vacio = true;
      // Pedir la capital del pais
      System.out.print("\nEscribe el nombre de un país y te diré su capital: ");
      pais = System.console().readLine();
      // Si no es salir se ejecuta
      if (!pais.equalsIgnoreCase("salir")) {
        for (String p : paises.keySet()) {
          if (p.equalsIgnoreCase(pais)) {
            System.out.println("La capital de " + p + " es " + paises.get(p));
            vacio = false;
            break;
          }
        }
        if (vacio == true) {
          System.out.print("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
          capital = System.console().readLine();
          paises.put(pais, capital); // Añadir pais y su capital
        }
      }
    } while (!pais.equalsIgnoreCase("salir"));

    System.out.println();
  }
}