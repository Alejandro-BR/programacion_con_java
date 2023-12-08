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

public class T05Ejercicio48 {
  public static void main(String[] args) {
    try {
      long numeroAuxiliar;
      long copiaNumero;
      long digito;
      long numeroVolteado = 0;

      boolean num0 = false;
      boolean num1 = false;
      boolean num2 = false;
      boolean num3 = false;
      boolean num4 = false;
      boolean num5 = false;
      boolean num6 = false;
      boolean num7 = false;
      boolean num8 = false;
      boolean num9 = false;

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); // SALTO DE LINEA
      System.out.print("Introduzca un número entero: ");
      long numero = sc.nextLong();
      sc.close(); // Cierre del Scanner

      copiaNumero = numero;
      while (copiaNumero > 0) {
        numeroVolteado = ((numeroVolteado * 10) + (copiaNumero % 10));
        copiaNumero /= 10;
      }

      System.out.print("Dígitos que aparecen en el número: ");

      numeroAuxiliar = numeroVolteado;
      while (numeroAuxiliar != 0) {
        digito = numeroAuxiliar;
        digito %= 10;
        numeroAuxiliar /= 10;
        if (digito == 0) {
          num0 = true;
        }
        if (digito == 1) {
          num1 = true;
        }
        if (digito == 2) {
          num2 = true;
        }
        if (digito == 3) {
          num3 = true;
        }
        if (digito == 4) {
          num4 = true;
        }
        if (digito == 5) {
          num5 = true;
        }
        if (digito == 6) {
          num6 = true;
        }
        if (digito == 7) {
          num7 = true;
        }
        if (digito == 8) {
          num8 = true;
        }
        if (digito == 9) {
          num9 = true;
        }
      }

      if (num0 == true) {
        System.out.print("0 ");
      }
      if (num1 == true) {
        System.out.print("1 ");
      }
      if (num2 == true) {
        System.out.print("2 ");
      }
      if (num3 == true) {
        System.out.print("3 ");
      }
      if (num4 == true) {
        System.out.print("4 ");
      }
      if (num5 == true) {
        System.out.print("5 ");
      }
      if (num6 == true) {
        System.out.print("6 ");
      }
      if (num7 == true) {
        System.out.print("7 ");
      }
      if (num8 == true) {
        System.out.print("8 ");
      }
      if (num9 == true) {
        System.out.print("9 ");
      }

      System.out.println(""); // SALTO DE LINEA
      System.out.print("Dígitos que no aparecen:  ");

      if (num0 == false) {
        System.out.print("0 ");
      }
      if (num1 == false) {
        System.out.print("1 ");
      }
      if (num2 == false) {
        System.out.print("2 ");
      }
      if (num3 == false) {
        System.out.print("3 ");
      }
      if (num4 == false) {
        System.out.print("4 ");
      }
      if (num5 == false) {
        System.out.print("5 ");
      }
      if (num6 == false) {
        System.out.print("6 ");
      }
      if (num7 == false) {
        System.out.print("7 ");
      }
      if (num8 == false) {
        System.out.print("8 ");
      }
      if (num9 == false) {
        System.out.print("9 ");
      }

      System.out.println(""); //SALTO DE LINEA 
      System.out.println(""); //SALTO DE LINEA 

    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
