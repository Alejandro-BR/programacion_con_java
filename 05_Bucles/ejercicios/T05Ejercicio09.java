/**
 * Ejercicio 9: Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 

public class T05Ejercicio09 {
  public static void main(String[] args) {

    int numeroCifras = 1; //En caso de entrar en el siguiente bucle, entonces es porque el numero es de 1 cifra

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("El numero introducido no puede tener mas de 5 cifras ya sea positivo o negativo.");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el numero: ");
    long numeroIntroducido = sc.nextLong();
    sc.close(); //Cierre del Scanner 

    long n = numeroIntroducido;

    while (n >= 10) {
      n /= 10;         // n /= 10    <-->    n = n / 10
      numeroCifras++;
    }

if (numeroCifras == 1) {
  System.out.println(numeroIntroducido + " tiene 1 cifra");
} else {
  System.out.println(numeroIntroducido + " tiene " +  numeroCifras + " cifras");
}

    System.out.println(""); //SALTO DE LINEA 

  }
}
