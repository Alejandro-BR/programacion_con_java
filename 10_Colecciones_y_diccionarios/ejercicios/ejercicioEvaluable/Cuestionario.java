/**
 * Actividad evaluable
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package ejercicioEvaluable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Cuestionario {
  public static void main(String[] args) {
    HashMap<String, String> paises = new HashMap<String, String>();
    ArrayList<String> respuestasIncorrectas = new ArrayList<>();
    int respuesta;
    int indice = 0;
    int acertadas = 0;
    int orden;

    // Respuestas correctas
    paises.put("Alemania", "Berlín"); // 1
    paises.put("Andorra", "Andorra La Vieja"); // 2
    paises.put("España", "Madrid"); // 3
    paises.put("Francia", "París"); // 4
    paises.put("Grecia", "Atenas"); // 5
    paises.put("Italia", "Roma"); // 6
    paises.put("Lituania", "Vilna"); // 7
    paises.put("Irlanda", "Dublín"); // 8
    paises.put("Bélgica", "Bruselas"); // 9
    paises.put("Hungría", "Budapest"); // 10

    // Respuestas incorrectas
    respuestasIncorrectas.add("Tirana"); // 1
    respuestasIncorrectas.add("Ereván"); // 2
    respuestasIncorrectas.add("Viena"); // 3
    respuestasIncorrectas.add("Bakú"); // 4
    respuestasIncorrectas.add("Minsk"); // 5
    respuestasIncorrectas.add("Sarajevo"); // 6
    respuestasIncorrectas.add("Sofía"); // 7
    respuestasIncorrectas.add("Nicosia"); // 8
    respuestasIncorrectas.add("Ciudad del Vaticano"); // 9
    respuestasIncorrectas.add("Zagreb"); // 10
    respuestasIncorrectas.add("Copenhague"); // 11
    respuestasIncorrectas.add("Bratislava"); // 12
    respuestasIncorrectas.add("Liubliana"); // 13
    respuestasIncorrectas.add("Tallín"); // 14
    respuestasIncorrectas.add("Helsinki"); // 15
    respuestasIncorrectas.add("Tiflis"); // 16
    respuestasIncorrectas.add("Vaduz"); // 17
    respuestasIncorrectas.add("Skopie"); // 18
    respuestasIncorrectas.add("Riga"); // 19
    respuestasIncorrectas.add("Tokyo"); // 20

    // Desordenar arrayListh
    Collections.shuffle(respuestasIncorrectas);

    // Desordenar HashMasp
    HashMap<String, String> aux = new HashMap<String, String>();
    int numAux = 10;
    boolean[] cambiado = new boolean[10];
    do {
      int orden2 = (int)(Math.random()*10);
      if (cambiado[0] == false && orden2 == 0) {
        // aux.put(paises.get(0), paises.getValue(paises.get(0)));
        cambiado[0] = true;
      }
      if (cambiado[1] == false && orden2 == 1) {
        cambiado[1] = true;
      }
      if (cambiado[2] == false && orden2 == 2) {
        cambiado[2] = true;
      }
      if (cambiado[3] == false && orden2 == 3) {
        cambiado[3] = true;
      }
      if (cambiado[4] == false && orden2 == 4) {
        cambiado[4] = true;
      }
      if (cambiado[5] == false && orden2 == 5) {
        cambiado[5] = true;
      }
      if (cambiado[6] == false && orden2 == 6) {
        cambiado[6] = true;
      }
      if (cambiado[7] == false && orden2 == 7) {
        cambiado[7] = true;
      }
      if (cambiado[8] == false && orden2 == 8) {
        cambiado[8] = true;
      }
      if (cambiado[9] == false && orden2 == 9) {
        cambiado[9] = true;
      }
    } while (numAux == 0);

    System.out.println("\nExamen: \n");

    for (String pais : paises.keySet()) {
      System.out.println("¿Cuál es la capital de " + pais + " ?");
      orden = (int)(Math.random() * 3);
      // Opcion 1
      if (orden == 0) {
        System.out.println("1. " + paises.get(pais));
      } else {
        System.out.println("1. " + respuestasIncorrectas.get(indice));
        // Borra las respuesta incorrecta
        respuestasIncorrectas.remove(indice);
      }
      // Opcion 2
      if (orden == 1) {
        System.out.println("2. " + paises.get(pais));
      } else {
        System.out.println("2. " + respuestasIncorrectas.get(indice));
        // Borra las respuesta incorrecta
        respuestasIncorrectas.remove(indice);
      }
      // Opcion 3
      if (orden == 2) {
        System.out.println("3. " + paises.get(pais));
      } else {
        System.out.println("3. " + respuestasIncorrectas.get(indice));
        // Borra las respuesta incorrecta
        respuestasIncorrectas.remove(indice);
      }
      //Respuesta
      System.out.print("\nRespuesta: ");
      respuesta = Integer.parseInt(System.console().readLine());
      System.out.println();
      if (respuesta -1  == orden) {
        acertadas++;
      }
    }

    if (acertadas >= 5) {
      System.out.println("¡Enhorabuena! ¡Has aprobado! Puntuación: " + acertadas + "\n");
    } else {
      System.out.println("¡Has suspendido! Puntuación: " + acertadas + "\n");
    }
  }
}
