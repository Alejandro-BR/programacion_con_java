/**
 * Ejercicio 1 Examen:
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    try {
      String respuesta = " ";

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      do {
        // Obstencion del nombre y las notas

        System.out.println(""); // SALTO DE LINEA
        System.out.println("Introduzca el nombre con el formato Apellido1 Apellido2, Nombre:");
        String nombre = sc.nextLine();
        System.out.println(""); // SALTO DE LINEA

        System.out.print("Introduzca la nota del primer trimestre: ");
        double notaPrimerT = sc.nextDouble();
        System.out.print("Introduzca la nota del segundo trimestre: ");
        double notaSegundoT = sc.nextDouble();
        System.out.print("Introduzca la nota del tercer trimestre: ");
        double notaTercerT = sc.nextDouble();

        System.out.println(""); // SALTO DE LINEA

        if (notaPrimerT < 0 || notaPrimerT > 10) {
          System.out.println("Introduciste mal la nota del primer trimestre.");
          do {
            System.out.println("Introduzca la nota del primer trimestre: ");
            notaPrimerT = sc.nextInt();
          } while ((notaPrimerT >= 0) && (notaPrimerT <= 10));
        }

        if (notaSegundoT < 0 || notaSegundoT > 10) {
          System.out.println("Introduciste mal la nota del segundo trimestre.");
          do {
            System.out.println("Introduzca la nota del segundo trimestre: ");
            notaSegundoT = sc.nextInt();
          } while ((notaSegundoT >= 0) && (notaSegundoT <= 10));
        }

        if (notaTercerT < 0 || notaTercerT > 10) {
          System.out.println("Introduciste mal la nota del tercer trimestre.");
          do {
            System.out.println("Introduzca la nota del tercer trimestre: ");
            notaTercerT = sc.nextInt();
          } while ((notaTercerT >= 0) && (notaTercerT <= 10));
        }

        System.out.println(""); // SALTO DE LINEA

        // Calculo de media

        double media = (notaPrimerT + notaSegundoT + notaTercerT) / 3;

        // Anchura de la primera fila

        int numeroLetras = nombre.length();

        // Primera fila
        System.out.print(" ");
        for (int i = 1; i <= numeroLetras + 2; i++) {
          System.out.print("-");
        }

        for (int i = 1; i <= 3; i++) {
          System.out.print(" ---");
        }

        System.out.print(" ");
        for (int i = 1; i <= 6; i++) {
          System.out.print("-");
        }
        System.out.println(""); // SALTO DE LINEA

        // Fila del medio

        System.out.print("| \033[1;0m" + nombre + "\033[0m | ");
        if (notaPrimerT >= 5) {
          System.out.printf("\033[1;32m%1.0f \033[0m| ", notaPrimerT);
        } else {
          System.out.printf("\033[1;31m%1.0f \033[0m| ", notaPrimerT);
        }

        if (notaSegundoT >= 5) {
          System.out.printf("\033[1;32m%1.0f \033[0m| ", notaSegundoT);
        } else {
          System.out.printf("\033[1;31m%1.0f \033[0m| ", notaSegundoT);
        }

        if (notaTercerT >= 5) {
          System.out.printf("\033[1;32m%1.0f \033[0m| ", notaTercerT);
        } else {
          System.out.printf("\033[1;31m%1.0f \033[0m| ", notaTercerT);
        }

        if (media >= 5) {
          System.out.printf("\033[1;32m%1.2f \033[0m|\n", media);
        } else {
          System.out.printf("\033[1;31m%1.2f \033[0m|\n", media);
        }

        // Ultima fila
        System.out.print(" ");
        for (int i = 1; i <= numeroLetras + 2; i++) {
          System.out.print("-");
        }

        for (int i = 1; i <= 3; i++) {
          System.out.print(" ---");
        }

        System.out.print(" ");
        for (int i = 1; i <= 6; i++) {
          System.out.print("-");
        }

        System.out.println(""); // SALTO DE LINEA
        System.out.println(""); // SALTO DE LINEA

        System.out.print("¿ Desea continuar introduciendo notas de nuevos alumnos ? (S/N)");
        respuesta = sc.nextLine();
        System.out.println(""); //SALTO DE LINEA 

        switch (respuesta) {
        case "S":
          System.out.println("Nuevo Alumno +");
          break;
        case "N":
          System.out.println("Fin del programa.");
          break;
        default:
          respuesta = "N";
          System.out.println("Se saldra del programa debido a que no introduciste un valor correcto.");
          break;
      }

      System.out.println(""); //SALTO DE LINEA 

      } while (respuesta.equals("N"));

        sc.close(); // Cierre del Scanner

    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }

}