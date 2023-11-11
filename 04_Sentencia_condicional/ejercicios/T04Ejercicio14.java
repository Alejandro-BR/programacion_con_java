/**
 * Ejercicio 14: Realiza un programa que diga si un numero introducido por teclado es par y/o divisible entre 5
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio14 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el numero: ");
    int numero = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    if ((numero % 5 ) == 0 ) {
      System.out.println("El numero " + numero + " es divisible por 5");
    } else {
      System.out.println("El numero " + numero + " no es divisible por 5");
    }

    if ((numero % 2) == 0) {
      System.out.println("El numero " + numero + " es par");
    } else {
      System.out.println("El numero " + numero + "no es par");
    }

    System.out.println(""); //SALTO DE LINEA 
  }
}
