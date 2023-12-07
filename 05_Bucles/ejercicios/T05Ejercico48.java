
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
      int numeroAuxiliar;
      int copiaNumero;
      int digito;
      int numeroVolteado = 0;

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
      int numero = sc.nextInt();
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
          System.out.print(digito);
          num0 = true;
        }
        if (digito == 1) {
          System.out.print(digito);
          num1 = true;
        }
        if (digito == 2) {
          System.out.print(digito);
          num2 = true;
        }
        if (digito == 3) {
          System.out.print(digito);
          num3 = true;
        }
        if (digito == 4) {
          System.out.print(digito);
          num4 = true;
        }
        if (digito == 5) {
          System.out.print(digito);
          num5 = true;
        }
        if (digito == 6) {
          System.out.print(digito);
          num6 = true;
        }
        if (digito == 7) {
          System.out.print(digito);
          num7 = true;
        }
        if (digito == 8) {
          System.out.print(digito);
          num8 = true;
        }
        if (digito == 9) {
          System.out.print(digito);
          num9 = true;
        }
      }

      System.out.println(""); // SALTO DE LINEA
      System.out.print("Dígitos que no aparecen:  ");

      if (num0 == false) {
        System.out.print("0");
      }
      if (num1 == false) {
        System.out.print("1");
      }
      if (num2 == false) {
        System.out.print("2");
      }
      if (num3 == false) {
        System.out.print("3");
      }
      if (num4 == false) {
        System.out.print("4");
      }
      if (num5 == false) {
        System.out.print("5");
      }
      if (num6 == false) {
        System.out.print("6");
      }
      if (num7 == false) {
        System.out.print("7");
      }
      if (num8 == false) {
        System.out.print("8");
      }
      if (num9 == false) {
        System.out.print("9");
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
