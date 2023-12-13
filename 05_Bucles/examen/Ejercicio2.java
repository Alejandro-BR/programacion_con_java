
/**
 * Ejercicio 2 Examen:
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    try {
      int logintud;
      boolean correcto = false;
      boolean piedra1 = false;
      boolean piedra2 = false;
      boolean tijeras2 = false;
      boolean tijeras1 = false;
      boolean papel1 = false;
      boolean papel2 = false;

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); // SALTO DE LINEA
      System.out.print("Nombre del jugador 1: ");
      String jugador1 = sc.nextLine();
      System.out.print("Nombre del jugador 2: ");
      String jugador2 = sc.nextLine();
      System.out.println(""); // SALTO DE LINEA

      int longitudJ1 = jugador1.length(); // Longitud de caracteres del jugador 1
      int longitudJ2 = jugador2.length(); // Longitud de caracteres del jugador 2

      // Longitud mayor
      if (longitudJ1 > longitudJ2) {
        logintud = longitudJ1;
      } else {
        logintud = longitudJ2;
      }

      // Jugada 1
      do {
        System.out.print("Jugada del primer jugador (piedra, papel, tijeras):");
        String jugada1 = sc.nextLine();
        switch (jugada1) {
          case "papel":
            correcto = false;
            papel1 = true;
            break;
          case "piedra":
            piedra1 = true;
            correcto = false;
            break;
          case "tijeras":
            tijeras1 = true;
            correcto = false;
            break;
          default:
            correcto = true;
            break;
        }
      } while (correcto = false);

      // Borrar pantalla
      System.out.print("\033[H\033[2J");
      System.out.flush();

      // Jugada 2
      do {
        System.out.print("Jugada del segundo jugador (piedra, papel, tijeras):");
        String jugada2 = sc.nextLine();
        switch (jugada2) {
          case "papel":
            correcto = false;
            papel2 = true;
            break;
          case "piedra":
            piedra2 = true;
            correcto = false;
            break;
          case "tijeras":
            tijeras2 = true;
            correcto = false;
            break;
          default:
            correcto = true;
            break;
        }
      } while (correcto = false);

      // Borrar pantalla
      System.out.print("\033[H\033[2J");
      System.out.flush();

      sc.close(); // Cierre del Scanner

      int contadorJ1 = 0;
      int contadorJ2 = 0;

      // Comprobar quien gano
      if (papel1 && piedra2) {
        contadorJ1++;
      } else if (papel2 && piedra1) {
        contadorJ2++;
      }

      if (piedra1 && tijeras2) {
        contadorJ1++;
      } else if (piedra2 && tijeras1) {
        contadorJ2++;
      }

      if (tijeras1 && papel2) {
        contadorJ1++;
      } else if (tijeras2 && papel1) {
        contadorJ2++;
      }

      //Puntuacion
      System.out.println(contadorJ1);
      System.out.println(contadorJ2);

      //No me dio tiempo terminarlo


    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
