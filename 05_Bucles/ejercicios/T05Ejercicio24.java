/**
 * Ejercicio 24: Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 * 
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * Tarde mas de una hora pero lo consegui :)
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;
public class T05Ejercicio24 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Introduce el simbolo: ");
    int numero = sc.nextInt();
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = sc.nextInt();
    System.out.println(""); //SALTO DE LINEA 
    sc.close(); //Cierre del Scanner 

    int nivel = 1; //Variable que controla en que nivel estoy pintando, siendo 1 la cima de la piramide
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosPorDentro = 0;

    //Pintamos toda la piramide excepto la base
    while (nivel < alturaIntroducida)  {
      //Pintamos los espcaios por delante
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      //Pintamos el caracter
      System.out.print(numero);

      if (nivel == 2) {
        System.out.print(numero + 1);
      } else {
        //Pintamos los numeros por dentro
        for (int i = numero +1; i < espaciosPorDentro - 1; i++) {
          System.out.print(i);
        }
        for (int i = espaciosPorDentro - 1; i > numero; i--){
          System.out.print(i);
        }
      }

      //Pintamos el segundo caracter, excepto en el nivel 1
      if (nivel > 1) {
        System.out.print(numero);      }

        //Saltamos de linea
        System.out.println(); 

        espaciosPorDentro += 2; //En cada nivel pintamos 2 huecos mas
        nivel ++; //Aumentamos un nivel en la piramide
        espaciosPorDelante--;

    }

    //Base de la piramide
    for (int i = 1; i < (alturaIntroducida + 1); i++){
      System.out.print(i);
    }
    for (int i = alturaIntroducida - 1; i >= numero; i--){
      System.out.print(i);
    }

    System.out.println(""); //SALTO DE LINEA
    System.out.println(""); //SALTO DE LINEA

  }
}
