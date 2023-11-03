import java.util.Scanner;
/**
 * Ejercicio 3: Realiza un conversor de psetas a euros. La cantidad de psetas que se requiere convertir deber ser introducida por teclado
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T03Ejercicio03 {
  public static void main(String[] args) {
    // 166.386 pesetas = 1 euro
    
    System.out.println(""); //SALTO DE LINEA
    System.out.println("CONVERTIDOR DE PESETAS A EUROS: ");
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in); //Creamos un objetos de la clase Scanner, llamado sc"
    
    System.out.print("Introduce las pesetas que quieres convertir: ");
    int pesetas = sc.nextInt();
    
    sc.close(); //Cierre del Scanner; 

    double euros = pesetas / 166.386;

    System.out.println(""); //Espacios
    System .out.printf(" %.0f", pesetas ); 
    System.out.print (" pesetas = ");
    System.out.printf(" %.2f", euros ); 
    System.out.println(" euros.");
    System.out.println(""); //Espacios
  }
}
