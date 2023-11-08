/**
 * Ejercicio 7: Realiza un programa que calcule la media de tres notas.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio07 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce la primera nota: ");
    double nota1 = sc.nextDouble();
    System.out.print("Introduce la segunda nota: ");
    double nota2 = sc.nextDouble();
    System.out.print("Introduce la tercera nota: ");
    double nota3 = sc.nextDouble();
    sc.close(); //Cierre del Scanner 

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("nota media de los examenes: %.2f",media);

    if (media >= 5) {
      System.out.println("Aprobaste");
    } else {
      System.out.println("Suspendiste");
    }

    System.out.println(""); //SALTO DE LINEA 
  }
}
