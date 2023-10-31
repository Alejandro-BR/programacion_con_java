/**
 * Ejercicio 3 Ejemplo: Escribe un programa que muestre por pantalla un menu que permita seleccionar tres opciones:
 * calcular el area de un cuadrado, de un rectangulo, y de un triangulo. Se solicita al usuario la opcion y,
 * en funcion de lo elegido, se solicita los datos necesarios y se mostrara en pantalla el resultado de calcular el area del cuadrado,
 * rectangulo o triangulo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class Ejercicio03Ejm {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("      MENU:");
    System.out.println("*****************");
    System.out.println("1. Cuadrado");
    System.out.println("2. Rectangulo");
    System.out.println("3. Triangulo");
    System.out.println("");
    System.out.println("Elige el modo de lo que quieras obtener su area:");

    int modo = sc.nextInt();
    sc.close(); 


  }
}
