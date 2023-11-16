/**
 * Ejercicio 16: Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio16 {
  public static void main(String[] args) {
    boolean Primo = true;

    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce un numero para saber si es primo: ");
    int numero = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    for (int i = 2; i <= numero / 2; i++) {
      if (numero % i == 0) {
          Primo = false;
          break;
      }
  }

  if (Primo) {
    System.out.println(numero + " es un número primo.");
  } else {
    System.out.println(numero + " no es un número primo.");
  }

    System.out.println(""); //SALTO DE LINEA 
  }
}
