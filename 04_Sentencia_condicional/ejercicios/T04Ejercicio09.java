/**
 * Ejercicio 9: Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0).
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio09 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce la a: ");
    double a = sc.nextDouble();
    System.out.print("Introduce la b: ");
    double b = sc.nextDouble();
    System.out.print("Introduce la c: ");
    double c = sc.nextDouble();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 

    if (a != 0) {
      double x = ((b * b) - 4 * a * c);
      System.out.printf("x = %1.1f",x);
    } else{
      System.out.println("Esa ecuacion no tiene solución real.");
    }

    System.out.println(""); //SALTO DE LINEA
  }
}
