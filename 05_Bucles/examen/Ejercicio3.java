/**
 * Ejercicio 3 Examen:
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    try {

      int numeroIntroducido;
      int div = 0;
      int contadorDivisores = 0;
      int suma = 1;

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc
      System.out.println(""); // SALTO DE LINEA

      do {
        System.out.print("Introduzca un numero entero positivo: ");
        numeroIntroducido = sc.nextInt();
      } while (numeroIntroducido <= 0);

      sc.close(); // Cierre del Scanner

      System.out.println(""); // SALTO DE LINEA

      System.out.print("Los divisores propios de un numero son: ");

      for (int i = 2; i < numeroIntroducido; i++) {
        div = numeroIntroducido % i;
        if (div == 0) {
          contadorDivisores++;
        }
      }

      for (int i = 2; i < numeroIntroducido; i++) {
        div = numeroIntroducido % i;
        if (div == 0) {
          System.out.print(i);
          suma += i;
          if (i != contadorDivisores) {
            System.out.print(", ");
          }
        }
      }

      System.out.println(""); // SALTO DE LINEA
      System.out.println(""); // SALTO DE LINEA

      System.out.println("SUma de los divisores propios y el 1: " + suma);
      System.out.println(""); // SALTO DE LINEA

      if (suma == numeroIntroducido) {
        System.out.println("Es un numero perfecto.");
      } else {
        System.out.println("No es un numero perfecto.");
      }

      System.out.println(""); // SALTO DE LINEA

    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
