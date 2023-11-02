/**
 * Ejercicio 11: Realiza un conversor de Kb a Mb.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
// 1 Mb = 1024 Kb;
import java.util.Scanner; 
public class T03Ejercicio11 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Conversro de Kb a Mb:");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Kb : ");
    double Kb = sc.nextDouble();
    sc.close(); //Cierre del Scanner 

    double Mb = Kb / 1024;

    System.out.println(""); //SALTO DE LINEA 
    System.out.printf("Mb :  %4.2f", Mb);
    System.out.println(""); //SALTO DE LINEA 
    System.out.println(""); //SALTO DE LINEA 

  }
}
