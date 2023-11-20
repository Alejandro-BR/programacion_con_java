/**
 * Ejercicio 33: Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 * 
 * Ejemplo 1:
 * 
 * Introduzca la altura de la U: 5
 * *     *
 * *     *
 * *     *
 * *     *
 *  * * *
 * 
 * Ejemplo 2:
 * 
 * Introduzca la altura de la U: 4
 * *   *
 * *   *
 * *   *
 *  * * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Introduzca la altura de la U: ");
    int altura = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(" "); //SALTO DE LINEA 
    
    for (int i = 1; i < altura; i++ ){
      System.out.print("*");
      for (int j = 0; j < altura - 2; j++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.print(" ");
    for (int i = 0; i < altura - 2; i++){
      System.out.print("*");
    }
    System.out.println(" ");

    System.out.println(" "); //SALTO DE LINEA 
  }
}
