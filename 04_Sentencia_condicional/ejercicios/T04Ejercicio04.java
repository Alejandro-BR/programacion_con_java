/**
 * Ejercicio 4: Vamos a ampliar uno de los ejercicios de la relacion anterior para consideras las horas extras.
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias 
 * (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;
public class T04Ejercicio04 {
  public static void main(String[] args) {

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Calculo de salario:");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Horas trabajadas: ");
    int horas = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 

    if ((horas <= 40) && (horas >= 0)) {
      int salario = horas * 12;
      System.out.printf( "SALARIO:\033[32m %d €",salario);
    } else if (horas > 40){
      int horasExtras = horas - 40;
      int salario = (horas * 12) + (horasExtras * 16);
      System.out.printf( "SALARIO:\033[32m %d €",salario);
    } else {
      System.out.println("\033[31mIntroduce un numero positivo");
    }
    
    System.out.println("\033[0m"); //LIMPIAR COLOR
    System.out.println(""); //SALTO DE LINEA

  }
}
