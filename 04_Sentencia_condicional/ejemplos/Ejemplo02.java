/**
 * Ejemplo de operadores logicos
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.Scanner;

public class Ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Creamos un objetos de la clase Scanner, llamado sc
    int numero;

    System.out.print("Introduce un valor comprendido entre 1 y 100: ");
    numero = sc.nextInt();

    if ((numero >= 1) && (numero <= 100)) {
      System.out.println("Ehorabuena! El valor introducido es correcto");
    }else{
      System.out.println("El valor no es correcto");
    }
    
    sc.close(); //Cierre del Scanner; 
  }
}
