/**
 * Ejercicio 39: Escribe un programa que pida un numero entero positivo por teclado y que muestre a continuacion los numeros
 * desde el 1 al numero introducido junto con su factorial.
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca un numero entero positivo: 7
 * 1! = 1
 * 2! = 2
 * 3! = 6
 * 4! = 24
 * 5! = 120
 * 6! = 720
 * 7! = 5040
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio39 {
  public static void main(String[] args) {
    int factorial = 1;

    try {

      Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
      System.out.println(""); //SALTO DE LINEA 
      System.out.print("Por favor, introduzca un numero entero positivo: ");
      int numero = sc.nextInt();
      sc.close(); //Cierre del Scanner
      
      System.out.println(""); //SALTO DE LINEA 

      for (int i = 1; i <= numero + 6; i++){
        for (int j = i; j <= i; j++){
          factorial *= j;
        }
        System.out.println(i + "! = " + factorial);
      } 
      System.out.println(""); //SALTO DE LINEA 

    } catch (Exception e) {
      System.out.println(""); //SALTO DE LINEA 
      System.out.println("Error de mensaje: " + e.getMessage());
      System.out.println("Clase de excepcion: " + e.getClass());
      System.out.println(""); //SALTO DE LINEA 
    }
  }
}
