/**
 * Crea varias funciones extras
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.Scanner;

import funciones.numeros;

public class T08FuncionesExtras {
  public static void main(String[] args) {
    int numeroI1;

    Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

    System.out.println(""); // SALTO DE LINEA

    System.out.print("Introduce el numero: ");
    numeroI1 = sc.nextInt();

    System.out.println(""); // SALTO DE LINEA

    System.out.println("Factorial de " + numeroI1 + ": " + numeros.factorial(numeroI1)); // Factorial

    System.out.println(""); // SALTO DE LINEA

    System.out.print("Divisores de " + numeroI1 + ": "); // Divisores
    numeros.divisores(numeroI1);

    System.out.println(""); // SALTO DE LINEA
    System.out.println(""); // SALTO DE LINEA

    System.out.print("Introduce el numero: ");
    long numeroL1 = sc.nextLong();

    numeros.paresImpares(numeroL1); //Pares y impares que contiene un numero

    System.out.println(""); // SALTO DE LINEA

    sc.close(); // Cierre del Scanner

  }
}
