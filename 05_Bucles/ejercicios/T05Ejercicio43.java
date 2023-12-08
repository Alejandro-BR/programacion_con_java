/**
 * Ejercicio 43: Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca un número entero positivo: 406783
 * Introduzca la posición a partir de la cual quiere partir el número: 5
 * Los números partidos son el 4067 y el 83.
 * 
 * 
 * //No me sale es imposible
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio43 {
  public static void main(String[] args) {
    try {
      int digito;
      int numeroVolteado = 0;

      Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
      System.out.println(""); //SALTO DE LINEA 
      System.out.print("Por favor, introduzca un número entero positivo: ");
      int numero = sc.nextInt();
      System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
      int posicion = sc.nextInt();
      sc.close(); //Cierre del Scanner
      
      int copiaNumero = numero;

      while (copiaNumero > 0) {
        numeroVolteado = (copiaNumero % 10) + (numeroVolteado * 10);
        copiaNumero /= 10;
        System.out.println(copiaNumero);
      }

      System.out.print("Los números partidos son el ");

      while (copiaNumero > posicion) {
        digito = (copiaNumero % 10);    
        System.out.println(digito);
        copiaNumero /= 10;    //Buscamos la siguiente cifra
      }
      System.out.println(""); //SALTO DE LINEA 
      System.out.println(""); //SALTO DE LINEA 

    } catch (Exception e) {
      System.out.println(""); //SALTO DE LINEA 
      System.out.println("Error de mensaje: " + e.getMessage());
      System.out.println("Clase de excepcion: " + e.getClass());
      System.out.println(""); //SALTO DE LINEA 
    }
  }
}
