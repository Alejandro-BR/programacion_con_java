/**
 * Ejercicio 9: Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 * pi * r2 * h
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T03Ejercicio09 {
  public static void main(String[] args) {
  
    final double PI = Math. PI; //constante 
    double div = 0.33; //1/3
    
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Calcule el volumen de un cono:");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    System.out.print("Introduce la r: ");
    double r = sc.nextDouble();

    System.out.print("Introduce la h: ");
    double h = sc.nextDouble();

    sc.close(); //Cierre del Scanner 

    double v = (div * PI * (r * 2) * h);

    System.out.printf("V = 1/3 * PI * r2 * h =  %4.2f \n", v);
    System.out.println(""); //SALTO DE LINEA 
  }
}