/**
 * Ejercicio 68: Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar. Usa long en lugar de int donde sea necesario para admitir números largos.
 * 
 * Ejemplo 1:
 * 
 * Por favor, introduzca un número: 9402
 * Dislocando el 9402 sale el 8513.
 * 
 * Ejemplo 2:
 * 
 * Por favor, introduzca un número: 870958422
 * Dislocando el 870958422 sale el 961849533.
 * 
 * Ejemplo 3:
 * 
 * Por favor, introduzca un número: 137
 * Dislocando el 137 sale el 26
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class T05Ejercicio68 {
  public static void main(String[] args) {
    try {
      long numeroAuxiliar;
      long copiaNumero;
      long digito;
      long numeroVolteado = 0;
      int contador = 0;

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); // SALTO DE LINEA
      System.out.print("Por favor, introduzca un número: ");
      int numeroIntroducido = sc.nextInt();

      sc.close(); // Cierre del Scanner

      // Voltear numero
      copiaNumero = numeroIntroducido;
      while (copiaNumero > 0) {
        numeroVolteado = ((numeroVolteado * 10) + (copiaNumero % 10));
        copiaNumero /= 10;
        contador++;
      }

      System.out.print("Dislocando el " + numeroIntroducido + " sale el ");

      numeroAuxiliar = numeroVolteado;
      for (int i = 0; i < contador; i++) {
        digito = numeroAuxiliar;
        digito %= 10;
        numeroAuxiliar /= 10;
        if (digito % 2 == 0) {
          System.out.print(digito + 1);
        } else {
          System.out.print(digito - 1);
        }
      }

      System.out.println(""); //SALTO DE LINEA 
      System.out.println(""); //SALTO DE LINEA 

    } catch (InputMismatchException ime) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("No se perimiten introducir caracteres o letras.");
      System.out.println(""); // SALTO DE LINEA
    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }

  }
}
