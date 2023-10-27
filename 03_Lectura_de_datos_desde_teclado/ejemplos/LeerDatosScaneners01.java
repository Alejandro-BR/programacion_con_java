import java.util.Scanner; //hay que importar la clase Scanner

/**
 * Lectura de datos teclado usando la clase Scanner
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class LeerDatosScaneners01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");  //Creamos un objeto de la clase Scanner, llamado sc
    System.out.println("Introduce tu nombre: ");
    String nombre = sc.nextLine(); //Guardamos en la variable nombre lo que introducimos

    System.out.println("Introduce tu edad: ");
    int edad = sc.nextInt(); //Guardamos en la variable edad lo que introducimos por teclado

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");

    sc.close(); //Que se cierre en el Scanner;
  }
}
