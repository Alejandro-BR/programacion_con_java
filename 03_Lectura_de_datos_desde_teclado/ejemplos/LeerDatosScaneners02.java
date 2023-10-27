import java.util.Scanner;
/**
 * Lectura de datos desde 
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class LeerDatosScaneners02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Creamos un objetos de la clase Scanner, llamado sc
    
    System.out.print("Introduce tu nombre, appellidos y tu edad (Separados por un espacio): ");
    String nombre = sc.next();
    String apellido1 = sc.next();
    String apellido2 = sc.next();
    int edad = sc.nextInt();

    System.out.print("Tu nombre es " + nombre);
    System.out.print(" tu primer apellido es " + apellido1);
    System.out.print(", tu segundo appeliido es " + apellido2);
    System.out.println(" y tu edad es " + edad + " años.");

    sc.close(); //Para evitar el warning, ceerranos el buffer
  }
}
