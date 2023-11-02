/**
 * Ejercicio 6: Escribe un programa que calcule el area de un triangulo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T03Ejercicio06 {
  public static void main(String[] args) {

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("AREA DEL TRIANGULO: ");
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    System.out.println(""); //SALTO DE LINEA
    System.out.print("Introduce la altura del triangulo: ");
    double altura = sc.nextDouble();
    System.out.print("Introduce la base del triangulo: ");
    double base = sc.nextDouble();
    System.out.println(""); //SALTO DE LINEA

    sc.close(); //Cierre del Scanner 

    double area = base * altura;

    System.out.println("El area del triangulo es " + area);
    System.out.println(""); //SALTO DE LINEA

  }
}
