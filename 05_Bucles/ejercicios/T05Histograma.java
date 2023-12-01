/**
 * Ejercicio: Hacer un ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) hasta que se introduzca un número negativo. 
 * A continuación se mostrará una tabla donde en la primera columna aparecerán los números introducidos y en cada fila aparecerá repetido el carácter 
 * introducido tantas veces como indique la primera columna.
 *
 * Ejemplo:
 *
 * 1 | #
 * 5 | # # # # # #
 * 3 | # # #
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class T05Histograma {
  public static void main(String[] args) {
    try {

      int digitos = 0;
      int numeroDigitos = 0;
      int numeroVolteado = 0;
      int numeroIntroducido = 0;
      int copiaNumero = 0;
      int copiaDigitos = 0;
      int contador = 0;


      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); // SALTO DE LINEA
      System.out.println("El programa terminara cuando el numero introducido sea negativo.");
      System.out.println("Mientras el programa sumara si el numero introducido es mayor que el anterior y restara si es menor.");
      System.out.println("Introduce los numeros sin poner espacios y en la misma linea, ya cuando quieras terminar darle a enter y te lo pedira de nuevo hya pon un numero negativo para salir.");
      System.out.println(""); // SALTO DE LINEA

      do {   //Introducir la sucecion de numeros hasta la llegada de uno negativo
        System.out.print("Introduce un numero: ");
        numeroIntroducido = sc.nextInt();
        if (numeroIntroducido >= 0) {
          copiaNumero += (numeroIntroducido * 10);
        }
      } while (numeroIntroducido >= 0);

          while (copiaNumero > 0) {
            numeroVolteado =  ((numeroVolteado * 10) + (copiaNumero % 10));
            copiaNumero /= 10;
            if (copiaNumero != 0) {
              numeroDigitos++;
            }
          }

          for (int i = 0; i < numeroDigitos; i++){
            digitos = numeroVolteado % 10;
            numeroVolteado /= 10;

            System.out.printf("%-3d |",digitos); 
            if (digitos > copiaDigitos) {
              for (int j = 0; j < digitos + copiaDigitos; j++){
              System.out.print("#");
              contador++;
              }  
            } else {
              for (int j = 0; j <  digitos ; j++){
              System.out.print("#");
              }
            }

            System.out.println(""); //SALTO DE LINEA 
            copiaDigitos = digitos;
          }

      System.out.println(""); //SALTO DE LINEA 

      sc.close(); // Cierre del Scanner

    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Error de mensaje: " + e.getMessage());
      System.out.println("Clase de excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
