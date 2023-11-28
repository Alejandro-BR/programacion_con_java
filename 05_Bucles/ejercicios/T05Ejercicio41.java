/**
 * Ejercicio 41: Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 *
 * Ejemplo 1:
 *
 * Por favor, introduzca un número entero positivo: 406783
 * El 406783 contiene 4 dígitos pares y 2 dígitos impares.
 *
 * Ejemplo 2:
 *
 * Por favor, introduzca un número entero positivo: 3177840
 * El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio41 {
  public static void main(String[] args) {
    try {
      int pares = 0;
      int impares = 0;
      int digito;

      Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
      System.out.println(""); //SALTO DE LINEA 
      System.out.print("Por favor, introduzca un número entero positivo: ");
      long numero = sc.nextLong();
      sc.close(); //Cierre del Scanner
      long copiaNumero = numero;

      while (copiaNumero > 0) {
        digito =  (int) (copiaNumero % 10);    
          if ((digito % 2 == 0) && (digito != 0)) {
            pares++;
          } else if ((digito % 2 != 0) && (digito != 0)) {
            impares++;
          } 
        copiaNumero /= 10;    //Buscamos la siguiente cifra
      }
      
      System.out.println("El " + numero + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares."); 
      System.out.println(""); //SALTO DE LINEA 
    } catch (Exception e) {
      System.out.println(""); //SALTO DE LINEA 
      System.out.println("Error de mensaje: " + e.getMessage());
      System.out.println("Clase de excepcion: " + e.getClass());
      System.out.println(""); //SALTO DE LINEA 
    }
  }
}
