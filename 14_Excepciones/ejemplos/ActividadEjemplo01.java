/**
 * Explica tu codigo aqui
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class ActividadEjemplo01 {
  public static void main(String[] args) {
    int lineas;
    int asteriscos;
    int longitud;
    int cuentaAsteriscos;

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.println("Este programa pinta varias lineas de asteriscos");

    try {
      System.out.println("Introduce el numero total de asteriscos: ");
      asteriscos = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el numero total de asteriscos: ");
      lineas = Integer.parseInt(sc.nextLine());

      if ((asteriscos%lineas) == 0) {
        longitud = asteriscos / lineas;
      } else {
        longitud = (int) Math.ceil((double) asteriscos / (double) lineas);
      }
    } catch (NumberFormatException nfe){
      System.out.println("Se deben introducir valores tipo entero.");
    }
  }
}
