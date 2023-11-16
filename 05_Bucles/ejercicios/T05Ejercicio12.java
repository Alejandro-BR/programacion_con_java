/**
 * Ejercicio 12: Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio12 {
  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 1;
    int num3;

    System.out.println(""); //SALTO DE LINEA
    System.out.println("Serie Fibonacci:");
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce cuantos numeros de la serie de Fibonacci quieres: ");
    int numeros = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA

    switch (numeros) {
      case 1:
        System.out.println("0");
        break;
      case 2:
      System.out.println("0 1");
        break;
      default:
        System.out.print("0 1 ");
        for (int i = 1; i <= (numeros - 2); i++){
          num3 = num1 + num2;
          num1 = num2;
          num2 = num3;
          System.out.print(num3 + " ");
        }
        break;
    }

    System.out.println(""); //SALTO DE LINEA
    
  }
}
