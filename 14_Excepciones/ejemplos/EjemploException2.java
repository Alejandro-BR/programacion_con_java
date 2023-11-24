  /**
 * Ejemplo de getMessage
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class EjemploException2 {
  public static void main(String[] args) {
    int numero1;
    int numero2;
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    try {
      System.out.print("Introduzzca el primer numero: ");
      numero1 = sc.nextInt();
      System.out.print("Introduzzca otro numero: ");
      numero2 = sc.nextInt();
      System.out.println("La media es " + (numero1 + numero2) / 0);
      sc.close(); //Cierre del Scanner 
    }
    catch (Exception e){
      System.out.println("Error de mensaje: " + e.getMessage());
      System.out.println("Clase de excepcion: " + e.getClass());
    }finally {
      System.out.println("Gracias por utilizar este programa.");
    }

  }
}

