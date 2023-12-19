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
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el numero: ");
    numeroI1 = sc.nextInt();
    System.out.println("Resultado: " + numeros.factorial(numeroI1));

    sc.close(); //Cierre del Scanner 

  }
}
