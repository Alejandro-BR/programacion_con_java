/**
 * Ejercicio 15: Escribe un programa que pinte una piramide rellena con caracter introducido
 * por telcado que podria ser una letra, un numero o un simbolo como *, +, -, $, &, etc.
 * El programa debe permitir al usuario mediante un menur elegir si el vertice de la piramide esta 
 * apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;
public class T04Ejercicio15 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 

    System.out.println("MENU:");
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Entre estos digitos elige el que quieres usar en la piramide: ");
    System.out.println(" * + - $ & (Tambien se permite cualquier otro)");
    System.out.println("Elige que sea una piramide normal (1) o invertida (2).");

    System.out.println(""); //SALTO DE LINEA 
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el digito: ");
    String digito = sc.nextLine();
    System.out.print("Elige el modo: ");
    int modo = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 

    switch (modo) {
      case 1:
        System.out.println("    " + digito);
        System.out.println("   " + digito + " " + digito);
        System.out.println("  " + digito + "   " + digito);
        System.out.println(" " + digito + "     " + digito);
        System.out.println(digito + digito + digito + digito + digito + digito + digito + digito + digito);
        break;
      case 2:
        System.out.println(digito + digito + digito + digito + digito + digito + digito + digito + digito);
        System.out.println(" " + digito + "     " + digito);
        System.out.println("  " + digito + "   " + digito);
        System.out.println("   " + digito + " " + digito);
        System.out.println("    " + digito);
        break;
      default:
        System.out.println("Prueba utilizar otro simbolo distinto.");
        break;
    }
    System.out.println(""); //SALTO DE LINEA 
  }
}
