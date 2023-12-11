
/**
 * Ejercicio 52: Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
 * dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
 * queda igual.
 *
 * Ejemplo 1:
 * 
 * Introduzca un número: 609831
 * El número resultado es 98316
 * 
 * Ejemplo 2:
 * 
 * Introduzca un número: 78201345
 * El número resultado es 82013457
 * 
 * Ejemplo 3:
 * 
 * Introduzca un número: 24
 * El número resultado es 42
 * 
 * Ejemplo 4:
 * 
 * Introduzca un número: 8
 * El número resultado es 8
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.InputMismatchException; //catch ime
import java.util.Scanner;

public class T05Ejercicio52 {
  public static void main(String[] args) {
    try {
      long copiaNumero;
      long numeroVolteado = 0;
      long numeroAuxiliar = 0;
      long digito = 0;
      int contador = 0;
      int primerNumero = 0;

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); // SALTO DE LINEA
      System.out.print("Introduzca un número: ");
      long numero = sc.nextLong();

      sc.close(); // Cierre del Scanner

      // Voltear numero
      copiaNumero = numero;
      while (copiaNumero > 0) {
        numeroVolteado = ((numeroVolteado * 10) + (copiaNumero % 10));
        copiaNumero /= 10;
        contador++;
      }

      numeroAuxiliar = numeroVolteado;
      for (int i = 0; i < contador; i++) {
        digito = numeroAuxiliar;
        digito %= 10;
        numeroAuxiliar /= 10;
        if (i == 0)
        primerNumero = (int) digito;
      }

      System.out.print("El número resultado es ");

      numeroAuxiliar = numeroVolteado;
      for (int i = 0; i < contador; i++) {
        digito = numeroAuxiliar;
        digito %= 10;
        numeroAuxiliar /= 10;
        if ((i == 0) || ((digito == 0) && (i == 1))){
          System.out.print("");
        } else {
          System.out.print(digito);
        }
      }

      System.out.println(primerNumero);

      System.out.println(""); // SALTO DE LINEA

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
