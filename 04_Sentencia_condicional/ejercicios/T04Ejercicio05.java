/**
 * Ejercicio 5: Realiza un programa que resuelva una ecuacion de primer grado (del tipo ax+b=0)
 * 
 * Ejemplo 1: Este  programa resuelve ecuaciones de primer grado del tipo ax + b = 0
 * Por favor, introdozca el valor de a: 2
 * Ahora introduzca el valor de b: 1
 * x = -0.5
 * 
 * Ejemplo 2: Este programa resuelve ecuaciones de primer grado del tipo ax+b = 0
 * Por favor, introduzca el valor de a: 0
 * Ahora introduzca el valor de b: 7
 * Esa ecuacion no tiene solucion real.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio05 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax+b = 0"); 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Por favor, introduzca el valor de a: ");
    int a = sc.nextInt();
    System.out.print("Ahora introduzca el valor de b: ");
    int b = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    if (a != 0) {
      //ax + b = 0
      // x = -b / a 
      double x = (b * (-1))/a;
      System.out.println("X = " + x);
      System.out.printf("x = %1.1f",x);
    } else{
      System.out.println("Esa ecuacion no tiene solución real.");
    }

    System.out.println(""); //SALTO DE LINEA
  }
}

/* Lista de errores Preguntar en clase
 * b es 1 lo paso a -1 por la formula
 * b = -1
 * a = 2
 * -1/2 = -0.5
 *  pero el programa me manda 0.0
 */