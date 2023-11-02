/**
 * Ejercicio 8: Escribe un programa que calcule el salario semanal de un empleado en base alas horas trabajadas,
 * a razón de 12 euros la hora.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T03Ejercicio08 {
  public static void main(String[] args) {
    double salario;
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Calculo de salario:");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Horas trabajadas: ");
    int horas = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    salario = horas * 12;

    System.out.println(""); //SALTO DE LINEA 
    System.out.print("SALARIO --> ");
    System.out.print(salario);
    System.out.println(" € ");
    System.out.println(""); //SALTO DE LINEA 
  }
}
