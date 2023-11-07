/**
 * Problema 5: Escribe un programa que calcule el volumen de un tronco de cono según la siguiente fórmula:
  V = (1/3)πh(R2 + r2 + Rr)

  El título del ejercicio y el valor resultante para el volumen deben ser los únicos que aparezcan en negritas;
  además, el valor del volumen deberá mostrarse también en color verde y con 4 cifras decimales.

  AYUDA: El código hexadecimal Unicode para el exponente al cubo (³) es \u00B3.

  Ejemplo:

  VOLUMEN DE UN TRONCO DE CONO

  =====================

  Introduzca el radio de la base mayor R (cm): 5

  Introduzca el radio de la base menor r (cm): 2.5

  Introduzca la altura h (cm): 10

  El volumen del toroide es de 458,1489 cm³.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class Problema05 {
  public static void main(String[] args) {
    final double PI = Math.PI;
    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduzca el radio de la base mayor R (cm): ");
    double rM = sc.nextDouble();
    System.out.print("Introduzca el radio de la base menor r (cm): ");
    double r = sc.nextDouble();
    System.out.print("Introduzca la altura h (cm): ");
    double h = sc.nextDouble();
    sc.close(); //Cierre del Scanner 
    double div = 0.33;
    double v = div * PI * h *  ((rM * rM) + (r * r ) + rM * r);

    System.out.printf("El volumen del toroide es de \033[38;5;9m %2.4f cm\u00B3", v); 
    System.out.println(" \033[0m"); //BARRIDO DE COLOR
    System.out.println(""); //SALTO DE LINEA 

  }
}
