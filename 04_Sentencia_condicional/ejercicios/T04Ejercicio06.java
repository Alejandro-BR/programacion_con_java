/**
 * Ejercicio 6: Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √((2h)/g)     siendo g = 9.81m/s2
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio06 {
  public static void main(String[] args) {

    final double g = 9.81;  //g = 9.81m/s2 
    double t;
    
    System.out.println(""); //SALTO DE LINEA
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc
    System.out.print("Introduce la altura (h): ");
    double h = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    //Math.sqrt()  Raiz cuadrada √

    t = Math.sqrt((Math.pow(h,h)) / g);

    System.out.println("t = √((2h)/g)");
    System.out.printf("t = %.2f s \n",t); 

    System.out.println(""); //SALTO DE LINEA
  }
}
