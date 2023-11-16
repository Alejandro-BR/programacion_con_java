/**
 * Ejercicio 14: Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio14 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc
    System.out.print("Introduce la base: ");
    int base = sc.nextInt();
    System.out.print("Introduce el exponente: ");
    int exponente = sc.nextInt();
    sc.close(); //Cierre del Scanner
    
    double potencia = Math.pow(base, exponente);

    System.out.printf("%-2d con exponente %-2d =  %-2.0f \n",base, exponente, potencia); 
    System.out.println(""); //SALTO DE LINEA
  }
}
