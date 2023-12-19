/**
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo esPrimo.
 * 
 * En este probare todas las funciones del 1 al 14:
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.Scanner;
import funciones.numeros;

public class T08Ejercicios1_14 {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc
      // System.out.print("Introduce el numero: ");
      // long numero = sc.nextLong();
      // System.out.println("Numero de digitos: " + numeros.digitos(numero));

      // System.out.print("Introduce el numero: ");
      // int numero = sc.nextInt();
      // System.out.print("Introduce la posicion: ");
      // int posicion = sc.nextInt();
      // System.out.println("Numero de digitos: " + numeros.digitoN(numero, posicion));

      // System.out.print("Introduce el numero: ");
      // int numero = sc.nextInt();
      // System.out.print("Digito que buscas: ");
      // int digito = sc.nextInt();
      // System.out.println("El digito que buscas esta en la posicon " + numeros.posicionDeDigito(numero, digito));

      // System.out.print("Introduce el numero: ");
      // long numero = sc.nextLong();
      // System.out.print("Digitos que quieres quitar: ");
      // int digito = sc.nextInt();
      // System.out.println("El numero que queda: " + numeros.quitaPorDetras(numero, digito));

      // System.out.print("Introduce el numero: ");
      // long numero2 = sc.nextLong();
      // System.out.print("Digitos que quieres quitar: ");
      // int digito2 = sc.nextInt();
      // System.out.println("El numero que queda: " + numeros.quitaPorDelante(numero2, digito2));

      // System.out.print("Introduce el numero: ");
      // long numero = sc.nextLong();
      // System.out.print("Introduce el digito: ");
      // int digito = sc.nextInt();
      // System.out.println("El numero que queda: " + numeros.pegaPorDetras(numero, digito));

      // System.out.print("Introduce el numero: ");
      // long numero = sc.nextLong();
      // System.out.print("Introduce el digito: ");
      // int digito = sc.nextInt();
      // System.out.println("El numero que queda: " + numeros.pegaPorDelante(numero, digito));

      //NO ES COMO LO ESTABA HACIENDO
      // System.out.print("Introduce el numero: ");
      // long numero = sc.nextLong();
      // System.out.print("1 PRIMERO / 2 FINAL: ");
      // int modo = sc.nextInt();
      // System.out.println("Numero: " + numeros.trozoDeNumero(numero, modo));

      System.out.print("Introduce el primer numero: ");
      // long numero1 = sc.nextLong();
      int numero1 = sc.nextInt();
      System.out.print("Introduce el segundo numero: ");
      // long numero2 = sc.nextLong();
      int numero2 = sc.nextInt();
      System.out.println("Numero combinado: " + numeros.juntaNumeros(numero1,numero2));

      sc.close(); // Cierre del Scanner
    } catch (Exception e) {
      System.out.println(""); //SALTO DE LINEA 
      System.out.println("Se producio un error: " + e.getMessage());
      System.out.println("Clase de error: " + e.getClass());
      System.out.println(""); //SALTO DE LINEA 
    }

  }

}