/**
 * Ejercicio 10: Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio10 {
  public static void main(String[] args) {
    double media;
    int numeroMedias = 0;
    double numerosTotales = 0;
    double numeroIntroducido;

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    System.out.println(""); //SALTO DE LINEA
    System.out.println("MEDIA:");
    System.out.println("Terminara cuando se introduzca un numero positivo");
    System.out.println(""); //SALTO DE LINEA 
    do {
      System.out.print("Introduce un numero positivo: ");
      numeroIntroducido = sc.nextDouble();
      if (numeroIntroducido > 0) {
        numeroMedias++;
        numerosTotales += numeroIntroducido;
      }
    } while (numeroIntroducido >= 0);
    sc.close(); //Cierre del Scanner 

    media = (numerosTotales / numeroMedias);
    System.out.printf("La media es =  %.2f", media); 

    System.out.println(""); //SALTO DE LINEA 
  }
}
