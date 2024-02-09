/**
 * Escribe un programa que muestre tres apuestas aleatorias de la quiniela en
 * tres columnas para los 14 partidos y el Pleno al 15.
 * A diferencia del resto de partidos, donde pronosticas el equipo ganador a
 * través del clásico 1X2,
 * en el Pleno al 15 se indica el número de goles que marcará cada equipo. Es
 * decir, se mostrará 0, 1, 2 o M (más de 2 goles). (1,5 puntos)
 * De manera simultánea, para cada partido (cada fila) se generará de forma
 * aleatoria un resultado (1, X o 2, y el pleno al 15),
 * que deberás mostrar. (1 punto). Muestra el número de aciertos de cada apuesta
 * (columna) (0.5 puntos),
 * y si el número de aciertos es mayor o igual a 10, muestra un mensaje de que
 * ha sido preimado. (0.5 puntos).
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Quiniela {
  public static void main(String[] args) {
    int[][] apuestas = new int[4][14];
    int local = (int) (Math.random() * 4); // 0-3
    int visitante = (int) (Math.random() * 4); // 0-3
    int[] pleno = new int[2];

    // Dar los valores al array
    for (int i = 0; i < apuestas.length; i++) {
      for (int j = 0; j < apuestas[i].length; j++) {
        apuestas[i][j] = (int) (Math.random() * 3); // 0-2
      }
    }

    // Dar los valores al array del peno
    for (int i = 0; i < pleno.length; i++) {
      pleno[i] = (int) (Math.random() * 4);
    }

    // Limites
    System.out.println();
    for (int i = 0; i < 21; i++) {
      System.out.print("-");
    }

    // Dibujar la quiniela
    for (int i = 0; i < apuestas[0].length; i++) {
      System.out.printf("\n%2d. |", (i + 1)); // Indice
      for (int j = 0; j < apuestas.length; j++) {
        if (apuestas[j][i] == 0) {
          System.out.print(" X |");
        } else if (apuestas[j][i] == 1) {
          System.out.print("1  |");
        } else {
          System.out.print("  2|");
        }
      }
    }

    // Limites
    System.out.println();
    for (int i = 0; i < 21; i++) {
      System.out.print("-");
    }

    //La linea 15

    String localSimbolo;

    if (local == 3) {
      localSimbolo = "M";
    } else {
      localSimbolo = "" + local;
    }

    String visitanteSimbolo;

    if (local == 3) {
      visitanteSimbolo = "M";
    } else {
      visitanteSimbolo = "" + visitante;
    }

    System.out.println();
    System.out.println("15. | Local " + localSimbolo + "  Visitantes " + visitanteSimbolo);
    System.out.println();

    // Comprobar apuesta 1
    int aciertosP = 0;
    for (int i = 0; i < apuestas[0].length; i++) {
      if (apuestas[0][i] == apuestas[3][i]) {
        aciertosP++;
      }
    }

    // Comprobar apuesta 2
    int aciertosS = 0;
    for (int i = 0; i < apuestas[1].length; i++) {
      if (apuestas[1][i] == apuestas[3][i]) {
        aciertosS++;
      }
    }

    // Comprobar apuesta 3
    int aciertosT = 0;
    for (int i = 0; i < apuestas[2].length; i++) {
      if (apuestas[2][i] == apuestas[3][i]) {
        aciertosT++;
      }
    }

    if (aciertosP >= 10) {
      System.out.println("Fecilicidades el jugador 1 ah ganado");
    }

    if (aciertosS >= 10) {
      System.out.println("Fecilicidades el jugador 2 ah ganado");
    }

    if (aciertosT >= 10) {
      System.out.println("Fecilicidades el jugador 3 ah ganado");
    }

    if (local == pleno[0] && visitante == pleno[1]) {
      System.out.println("Felicidades as ganado el pleno");
    }

    System.out.println();

  }
}
