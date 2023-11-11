/**
 * Ejercicio 19: Realiza un programa que nos diga cuantos digitos tiene un numero entero que puede ser positivo o negativo. 
 * Se permiten numeros hasta 5 digitos.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio19 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("El numero introducido no puede tener mas de 5 cifras ya sea positivo o negativo.");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el numero: ");
    int numero = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    if (((numero < 10) && (numero > 0)) || ((numero > - 10) && (numero < 0))) {
      System.out.println("El numero " + numero + " tiene 1 cifra");
    } else if (((numero < 100) && (numero > 0)) || ((numero > - 100) && (numero < 0))){
      System.out.println("El numero " + numero + " tiene 2 cifras");
    } else if (((numero < 1000) && (numero > 99)) || ((numero > - 1000) && (numero < -99))) {
      System.out.println("El numero " + numero + " tiene 3 cifras");
    } else if (((numero < 10000) && (numero > 999)) || ((numero > - 10000) && (numero < -999))) {
      System.out.println("El numero " + numero + " tiene 4 cifras");
    } else if (((numero < 100000) && (numero > 9999)) || ((numero > - 100000) && (numero < -9999))) {
      System.out.println("El numero " + numero + " tiene 5 cifras");
    } else  {
      System.out.println("Introduce un numero correcto.");
    }

    System.out.println(""); //SALTO DE LINEA 

  }
}
