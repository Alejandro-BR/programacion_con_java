/**
 * Ejercicio 13 bidim: Realiza un programa que calcule la estatura media, 
 * mínima y máxima en centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los países se deben mostrar utilizando el array de países (no se pueden escribir
 * directamente).
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.InputMismatchException;

public class T07Ejercicio13_bidim {
  public static void main(String[] args) {
    try {
      String[] paises = {"España", "Rusia", "Japón", "Australia"};
      int[][] estaturas = new int[4][10];
      int minimo = Integer.MAX_VALUE;
      int maximo = Integer.MIN_VALUE;
      int suma = 0;

      //Mostramos las arrays y acicnamos los datos
      System.out.println();
      for (int i = 0; i < estaturas.length; i++) {
        System.out.printf("%-12s|", paises[i]);  //Pintamos los paises
        for (int j = 0; j < estaturas[i].length; j++) {
          estaturas[i][j] = (int)((Math.random()*71) + 140); //Asignamos las estaturas de forma aleatoria
          System.out.printf("%4d", estaturas[i][j]);  //Pintamos las estaturas
          if (estaturas[i][j] < minimo) {
            minimo = estaturas[i][j];
          }
          if (estaturas[i][j] > maximo) {
            maximo = estaturas[i][j];
          }
          suma += estaturas[i][j];
        }
        System.out.println(" | Media: " + (suma/estaturas[i].length) + " | Minimo: " + minimo + " | Maximo: " + maximo);
        //Reacicnamos los valores
        suma = 0;
        minimo = Integer.MAX_VALUE;
        maximo = Integer.MIN_VALUE;
      }
      System.out.println();

    } catch (InputMismatchException ime) {
      System.out.println();
      System.out.println("Introduciste caracteres alfanumerico en vez de numerico.");
      System.out.println();
    } catch (Exception e) {
      System.out.println();
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
      System.out.println();
    }
  }
}
