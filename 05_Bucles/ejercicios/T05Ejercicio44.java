/**
 * Ejercicio 44: Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca un número entero positivo: 406783
 * Introduzca la posición donde quiere insertar: 3
 * Introduzca el dígito que quiere insertar: 5
 * El número resultante es 4056783.
 * 
 * Codigo sacado de David
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class T05Ejercicio44 {
  public static void main(String[] args) {
    try {

      long numIntroducido;
      long copiaNumIntroducido;
      long numeroVolteado = 0;
      long ultimoDigito;
      int digitoAIntroducir;
      int posicionDigito;
      int contador = 0;

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); // SALTO DE LINEA

      System.out.print("Por favor, introduzca un número entero positivo: ");
      numIntroducido = sc.nextLong();
      copiaNumIntroducido = numIntroducido;

      System.out.print("Introduzca la posición donde quiere insertar: ");
      posicionDigito = sc.nextInt();

      System.out.print("Introduzca el dígito que quiere insertar: ");
      digitoAIntroducir = sc.nextInt();

      sc.close(); // Cierre del Scanner

      System.out.print("El número resultante es: ");


      while (copiaNumIntroducido > 0) {

        ultimoDigito = copiaNumIntroducido % 10;
        numeroVolteado = numeroVolteado * 10 + ultimoDigito;
        contador++;

        copiaNumIntroducido /= 10;
      }

      for (int i = 0; i < posicionDigito - 1; i++) {
        ultimoDigito = numeroVolteado % 10;
        numeroVolteado /= 10;

        System.out.print(ultimoDigito);
      }

      System.out.print(digitoAIntroducir);

      for (int i = 0; i < (contador - posicionDigito) + 1; i++) {
        ultimoDigito = numeroVolteado % 10;
        numeroVolteado /= 10;
        System.out.print(ultimoDigito);
      }

      System.out.println(""); //SALTO DE LINEA 

    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
