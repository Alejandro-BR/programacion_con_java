/**
 * Ejercicio 10 bidim: Realiza el juego de las tres en raya.
 * 
 * Esta casi completo a falta del caso de que nos quedemos sin espacio
 * y nadie gane y el caso de que ganemos verticalmente que se me paso ese caso.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T07Ejercicio10_bidim {
  public static void main(String[] args) {

      int[][] tablero = new int[3][3];
      boolean terminar = false;
      int leerX;
      int leerY;
      int maquinaX;
      int maquinaY;
      int contadorJ = 0;
      int contadorM = 0;
      boolean ganaJ = false;
      boolean ganaM = false;
      String ganador = " ";

      System.out.println();
      System.out.println("*******************************");
      System.out.println("* Juego de tres en raya       *");
      System.out.println("* Jugador (1) vs Maquina (2)  *");
      System.out.println("*******************************");
      System.out.println();

      do {

        // Mostrar tablero
        for (int i = 0; i < tablero.length; i++) {
          for (int j = 0; j < tablero.length; j++) {
            System.out.print(tablero[i][j] + " ");
          }
          System.out.println();
        }

        System.out.println();

        // Pedimos al jugador que diga donde pondra su ficha
        do {
          System.out.print("Introduce la cordenada Y (1-3): ");
          leerX = (Integer.parseInt(System.console().readLine())) - 1;
          System.out.print("Intorduce la cordenada X (1-3): ");
          leerY = (Integer.parseInt(System.console().readLine())) - 1;
        } while (tablero[leerY][leerX] != 0);

        tablero[leerY][leerX] = 1; // Asignamos un 1 al jugador

        // La maquina aleatoriamente elige una jugada
        do {
          maquinaY = (int) (Math.random() * 3);
          maquinaX = (int) (Math.random() * 3);
        } while (tablero[maquinaY][maquinaX] != 0);

        tablero[maquinaY][maquinaX] = 2; // Asignamos un 2 a la maquina

        // Mostrar tablero
        for (int i = 0; i < tablero.length; i++) {
          for (int j = 0; j < tablero.length; j++) {
            System.out.print(tablero[i][j] + " ");
          }
          System.out.println();
        }
        System.out.println();

        // Comprobamos que en ninguna linea hay tres consecutivos del mismo numero
        for (int i = 0; i < tablero.length; i++) {
          for (int j = 0; j < tablero.length; j++) {
            if (tablero[i][j] == 1) {
              contadorJ += 1;
            }
            if (tablero[i][j] == 2) {
              contadorM += 1;
            }
          }
          if (contadorJ == 3) {
            ganaJ = true;
          } else if (contadorM == 3) {
            ganaM = true;
          } else {
            contadorJ = 0;
            contadorM = 0;
          }
        }

        if (ganaM == true) {
          terminar = true;
        } else if (ganaJ == true) {
          terminar = true;
        } else {
          // Comprobamos diagonalmente lo mismo que en el anterior
          for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][i] == 1) {
              contadorJ += 1;
            }
            if (tablero[i][i] == 2) {
              contadorM += 1;
            }
          }

          if (contadorJ == 3) {
            ganaJ = true;
          } else if (contadorM == 3) {
            ganaM = true;
          } else {
            contadorJ = 0;
            contadorM = 0;
          }

          if (ganaM == true) {
            terminar = true;
          } else if (ganaJ == true) {
            terminar = true;
          } else {
            // Comprobamos en la otra diagonal
            for (int i = 0; i < 3; i++) {
              if (tablero[2 - i][i] == 1) {
                contadorJ += 1;
              }
              if (tablero[2 - i][i] == 2) {
                contadorM += 1;
              }
            }

            if (contadorJ == 3) {
              ganaJ = true;
            } else if (contadorM == 3) {
              ganaM = true;
            } else {
              contadorJ = 0;
              contadorM = 0;
            }
            
          if (ganaM == true) {
            terminar = true;
          } else if (ganaJ == true) {
            terminar = true;
          }
        }
      }
      } while (terminar == false);

      if (ganaJ == true) {
        ganador = "Jugador";
      } else {
        ganador = "Maquina";
      }

      System.out.println();
      System.out.println("EL ganador es " + ganador);
      System.out.println();

    }
}
