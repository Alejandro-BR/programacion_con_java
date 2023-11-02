/**
 * Ejercicio 12: Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay que tenr en cuenta 
 * que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.
 * 
 *   Ejemplo 1: 
 *      Introduce la nota del primer examen: 7
 *      ¿Que nota quieres sacar en el trimestre? 8.5
 *      Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
 * 
 *   Ejemplo 2:
 *      Introduce la nota del primer examen: 8
 *      ¿Que nota quieres sacar en el primer trismestre? 7 
 *      Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T03Ejercicio12 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = sc.nextDouble();

    System.out.print("¿Que nota quieres sacar en el trimestre?: ");
    double media = sc.nextDouble();

    sc.close(); //Cierre del Scanner 

    double nota2 =(((nota1 * 0.40) - media) * 100 / 60) * -1 ; 

    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Para tener un " + media + " en el trimestre necesitas sacar un ");
    System.out.printf(" %1.2f", nota2);
    System.out.println(" en el segundo examen.");
    System.out.println(""); //SALTO DE LINEA 
  }
}
