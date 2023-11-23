/**
 * Ejercicio 35: Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca la altura de la X: 5
 * *   *
 *  * *
 *   *
 *  * *
 * *   *
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.println("");
    System.out.print("Por favor, introduzca la altura de la x: ");
    int altura = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    for (int i = 1; i < altura; i++){
        for (int j = 0; j < i; j++){
          System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 0; j < i + 2; j++){
          System.out.print(" ");
        }
        for (int j = 0; j < i + 2; j++){
          
        }
        System.out.println(""); //SALTO DE LINEA 
    }
  }
}
