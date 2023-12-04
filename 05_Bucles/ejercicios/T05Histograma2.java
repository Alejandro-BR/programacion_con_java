
/**
 * Ejercicio Hitograma: Debes crear un programa que pida una serie de números entre 0 y 9.
 * El programa seguirá admitiendo números hasta que se introduzca uno negativo. 
 * Una vez introducidos los números, debe mostrar un histograma horizontal de asteriscos, 
 * donde en cada fila aparecerán tantos asteriscos como los números introducidos por orden de entrada. 
 *
 * Este histograma se presentará en forma de tabla, donde habrá tantas filas como números introducidos entre 0 y 9 
 * (el negativo no cuenta), y el número de columnas será una unidad superior al mayor de los números introducidos. 
 * Sube el .java a esta tarea.
 * 
 * CONSEJO: Dividid el problema en varias fases. Un ejemplo podría ser el siguiente:
 *
 * Solicitar números hasta introducir uno negativo.
 * Formar el número completo con los introducidos, sin tener en cuenta el último (el negativo).
 * Voltear dicho número, pues la tabla se representará por orden introducido.
 * Escribe cada dígito del número volteado en una línea distinta.
 * Añadir los caracteres - - - y | para formar una tabla, teniendo en cuenta el número de columnas indicado anteriormente.
 * Rellenar con caracteres cada fila, según la cifra que corresponda en cada caso.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class T05Histograma2 {
  public static void main(String[] args) {
    try {
      //Variables
      int numeroIntroducido = 0;
      int digitos = 0;
      int numeroDigitos = 0;
      int numeroVolteado = 0;
      int copiaNumero = 0;
      int copiaNumeroDigitos = 0;

      System.out.println(""); // SALTO DE LINEA
      System.out.println("Introduzca numeros entre 0 y 9 y pulsa INTRO. Introduce un numero negativo si desea parar.");
      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      //Introduccion de los digitos.
      do {
        numeroIntroducido = sc.nextInt();
        if (numeroIntroducido >= 0) {
          copiaNumero += (numeroIntroducido * 10);
        }
      } while (numeroIntroducido >= 0);

      sc.close(); // Cierre del Scanner

      // Voltear el numero
      while (copiaNumero > 0) {
        numeroVolteado = ((numeroVolteado * 10) + (copiaNumero % 10));
        copiaNumero /= 10;
        if (copiaNumero != 0) {
          numeroDigitos++;
        }
      }

      copiaNumeroDigitos += numeroDigitos; // Para poder saber cual es el ultimo numero

      // Dibujar
      for (int i = 0; i < numeroDigitos; i++) {
        digitos = numeroVolteado % 10;
        numeroVolteado /= 10;

        // ---
        for (int j = 0; j < digitos + 1; j++) {
          System.out.print(" ---");
        }
        System.out.println(""); // SALTO DE LINEA

        System.out.print("| " + digitos + " |"); // Escribir el numero

        // | * |
        for (int j = 0; j < digitos; j++) {
          System.out.print(" * ");
          System.out.print("|");
        }

        System.out.println(""); // SALTO DE LINEA

        if (copiaNumeroDigitos == 1) {
          for (int j = 0; j < digitos + 1; j++) {
            System.out.print(" ---");
          }
          System.out.println(""); // SALTO DE LINEA
        }

        copiaNumeroDigitos--;
      }
      System.out.println(""); // SALTO DE LINEA

    } catch (Exception e) {
      //Exception general por si se produce algun error.
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
