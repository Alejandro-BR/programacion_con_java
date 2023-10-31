/**
 * Escribe un programa que solicite por teclado un valor tipo numerico entero positivo y, hecho esto, muestre por pantalla
 * un mensaje que indique si ha aprobado o no.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.Scanner;

public class Ejemplo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota;

    System.out.print("¿Que nota has sacado en el ultimo examen?: ");
    nota = sc.nextInt();
     sc.close(); //Cierre del Scanner; 

    if (nota >= 5) {
      System.out.println("¡¡¡ENHORABUENA!!!");
    }else{
      System.out.println("Estudia mas");
    }
  }
}