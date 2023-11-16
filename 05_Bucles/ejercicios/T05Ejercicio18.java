/**
 * Ejercicico 18: Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio18 {
  public static void main(String[] args) {
    int num1;
    int num2;

    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    do {
      System.out.print("Introduce el primer numero: ");
      num1 = sc.nextInt();
      System.out.print("Introduce el segundo numero: ");
      num2 = sc.nextInt();
    } while ( num1 == num2);

    sc.close(); //Cierre del Scanner 

    for (int i = num1; i <= num2; i += 7){
      if ((i == num1 ) || (i == num2)) {
        
      } else {
        System.out.println(i);
      }
    }

    System.out.println(""); //SALTO DE LINEA 

  }
}
