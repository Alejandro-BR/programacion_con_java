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

    // if (a != 0) {
    //   double x = ((b * b) - 4 * a * c);
    //   System.out.printf("x = %1.1f",x);
    // } else{
    //   System.out.println("Esa ecuacion no tiene solución real.");
    // }

    double descriminante = Math.pow(b, 2) - (4*a*c);
    
    //ax2 + bx + c = 0 con a, b y c distintos de 0

    if ((a != 0) && (b != 0) && (c != 0)) {
      if (descriminante < 0) {
        System.out.println("La ecuacion no tiene soluciones reales");
      } else {
        System.out.println("x1 = " + (-b + Math.sqrt(descriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(descriminante))/(2 * a));
      }
    }

    //0x2 + 0x + 0 = 0

    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuacion tiene infinitas soluciones.");
    }

    //0x2 + 0x + c = 0    con c distinto de 0
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuacion no tiene solucion.");
      
    }

    //sin termino independiente (c = 0)
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b/a));
    }

    //0x2 + bx + c = 0  con b y c distinto de 0
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 " + (-c / b));
    }

    System.out.println(""); //SALTO DE LINEA
  }
}
