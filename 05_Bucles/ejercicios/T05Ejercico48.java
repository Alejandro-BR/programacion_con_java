
/**
 * Ejercicio 48: Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números largos.
 * 
 * Ejemplo 1:
 * 
 * Introduzca un número entero: 67706
 * Dígitos que aparecen en el número: 0 6 7
 * Dígitos que no aparecen: 1 2 3 4 5 8 9
 * 
 * Ejemplo 2:
 * 
 * Introduzca un número entero: 555
 * Dígitos que aparecen en el número: 5
 * Dígitos que no aparecen: 1 2 3 4 6 7 8 9
 * 
 * Ejemplo 3:
 * 
 * Introduzca un número entero: 9876543210
 * Dígitos que aparecen en el número: 0 1 2 3 4 5 6 7 8 9
 * Dígitos que no aparecen:
 * 
 * Ejemplo 4:
 * 
 * Introduzca un número entero: 13247721
 * Dígitos que aparecen en el número: 1 2 3 4 7
 * Dígitos que no aparecen: 0 5 6 8 9
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class T05Ejercico48 {
  public static void main(String[] args) {
    try {
      int contador = 0;
      int numeroAuxiliar;
      int copiaNumero;
      int digito;
      int numeroDigitos = 0;
      int numeroVolteado = 0;

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); // SALTO DE LINEA
      System.out.print("Introduzca un número entero: ");
      int numero = sc.nextInt();
      sc.close(); // Cierre del Scanner

      numeroAuxiliar = numero;
      while (numeroAuxiliar != 0) {
        // digito = numeroAuxiliar;
        // digito %= 10;
        numeroAuxiliar /= 10;
        contador++;
      }

      System.out.print("Dígitos que aparecen en el número: ");

      copiaNumero = numero;

      
      for (int i = 0; i < contador; i++) {
        digito = copiaNumero / 10;
        digito %= 10;
        if (digito == 0) {
          System.out.print(digito);
        }
        if (digito == 1) {
          System.out.print(digito);
        }
        if (digito == 2) {
          System.out.print(digito);
        }
        if (digito == 3) {
          System.out.print(digito);
        }
        if (digito == 4) {
          System.out.print(digito);
        }
        if (digito == 5) {
          System.out.print(digito);
        }
        if (digito == 6) {
          System.out.print(digito);
        }
        if (digito == 7) {
          System.out.print(digito);
        }
        if (digito == 8) {
          System.out.print(digito);
        }
        if (digito == 9) {
          System.out.print(digito);
        }
      }

    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
