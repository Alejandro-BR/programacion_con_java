/**
 * Ejercicio 31: Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * 
 * Introduzca la altura de la L: 5
 *  *
 *  *
 *  *
 *  *
 *  * * *
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio31 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduzca la altura de la L: ");
    int altura = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    for (int i = 1; i < altura; i++ ){
      System.out.println("*");
    }

    System.out.print("*");

    for (int i = 0; i < altura/2; i++){
      System.out.print("*");
    }

    System.out.println(""); //SALTO DE LINEA
    
  }
}
