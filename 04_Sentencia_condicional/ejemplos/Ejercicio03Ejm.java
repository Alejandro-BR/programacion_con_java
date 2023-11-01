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
    System.out.println(""); //SALTO DE PAGINA 
    System.out.println("      MENU:");
    System.out.println("*****************");
    System.out.println("1. Cuadrado");
    System.out.println("2. Rectangulo");
    System.out.println("3. Triangulo");
    System.out.println("");
    System.out.print("Elige el modo de lo que quieras obtener su area: ");

    int modo = sc.nextInt();

    System.out.println(""); //SALTO DE PAGINA
    
    switch (modo) {
      case 1:
        System.out.print("Introduce la altura del cuadrado: ");
        int alturaC = sc.nextInt();
        System.out.print("Introduce el ancho del cuadrado: ");
        int anchoC = sc.nextInt();
        int areaC = anchoC * alturaC;
        System.out.println(""); //SALTO DE PAGINA
        System.out.println("La area del cuadrado es " + areaC);
        break;
      case 2:
        System.out.print("Introduce la altura del rectangulo: ");
        int alturaR = sc.nextInt();
        System.out.print("Introduce el ancho del rectangulo: ");
        int anchoR = sc.nextInt();
        int areaR = anchoR * alturaR;
        System.out.println(""); //SALTO DE PAGINA
        System.out.println("La area del rectangulo es " + areaR);
        break;
      case 3:
        System.out.print("Introduce la altura del triangulo: ");
        int alturaT = sc.nextInt();
        System.out.print("Introduce la base del triangulo: ");
        int baseT = sc.nextInt();
        int areaT = baseT * alturaT;
        System.out.println(""); //SALTO DE PAGINA
        System.out.println("La area del triangulo es " + areaT);
        break;
      default:
        System.out.println("Introduce un valor correspondiente al menu porfavor.");
        break;
    }
    sc.close(); //Cierre del Scanner 
    System.out.println(""); //SALTO DE PAGINA 
  }
}
