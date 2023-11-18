/**
 * Ejercicio 21: Realiza un programa que vaya pidiendo numeros hasta que se introduzca un numero negativo y nos diga cuantos
 * numeros se han introducido, la media de los impares y el mayor de los pares. El numero negativo solo se utilizara para
 * indicar el final de la introduccion de datos pero no se incluye en el computo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio21 {
  public static void main(String[] args) {
    int numero;
    int mayorPar = 0;
    int inpar = 0;
    int numeroInpares = 0;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Introduce numeros sucesivamente, en el momento que introduzcas uno negativo se dejaran de pedir numeros.");
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    do {
      System.out.print("Introduce el numero: ");
      numero = sc.nextInt();
      if (numero % 2 == 0) {
        if (numero > mayorPar) {
          mayorPar = numero;
        }
      } else  if ((numero % 2 != 0) && (numero > 0)) {
        inpar += numero;
        numeroInpares++;
      }
    } while (numero >= 0); 
    
    sc.close(); //Cierre del Scanner 

    double media = inpar / numeroInpares;
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Media impares: " + media);
    System.out.println("Numero papr mas grande: " + mayorPar);
    System.out.println(""); //SALTO DE LINEA 

  }
}
