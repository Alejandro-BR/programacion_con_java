/**
 * Ejercicio 5: Escribe un programa que calcule el area de un rectangulo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T03Ejercicio05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce la altura del rectangulo: ");
    int alturaR = sc.nextInt();
    System.out.print("Introduce el ancho del rectangulo: ");
    int anchoR = sc.nextInt();
    int areaR = anchoR * alturaR;
    System.out.println(""); //SALTO DE PAGINA
    System.out.println("La area del rectangulo es " + areaR);
    sc.close(); //Cierre del Scanner 
    System.out.println(""); //SALTO DE PAGINA  
  }
}
