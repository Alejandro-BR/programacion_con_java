/**
 * Ejercicio 10: Realiza un conversor de Mb a Kb
 * 
 * @author Alejandro Barrionuevo Rosado
 */

//1 Megabyte (MB) = 1.024 KB

import java.util.Scanner; 
public class T03Ejercicio10 {
  public static void main(String[] args) {

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Conversro de Mb a Kb:");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Mb : ");
    int Mb = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    int Kb = Mb * 1024;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Kb : " + Kb);
    System.out.println(""); //SALTO DE LINEA 

  }
}
