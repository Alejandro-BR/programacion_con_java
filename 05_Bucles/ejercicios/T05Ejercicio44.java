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
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio44 {
  public static void main(String[] args) {
    try {
      long numeroVolteado = 0;
      int numeroDigitos = 0;
      int contador = 0;

      Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

      System.out.println(""); //SALTO DE LINEA 

      System.out.print("Por favor, introduzca un número entero positivo: ");
      long numero = sc.nextLong();

      System.out.print("Introduzca la posición donde quiere insertar: ");
      int posicion = sc.nextInt();

      System.out.print("Introduzca el dígito que quiere insertar: ");
      int digitoInsertado = sc.nextInt();

      sc.close(); //Cierre del Scanner 

      // Voltear el numero y sacar los digitos hasta el indicado
      long copiaNumero = numero;

      while (numeroDigitos <= posicion) {
        numeroVolteado = ((numeroVolteado * 10) + (copiaNumero % 10));
        copiaNumero /= 10;
        numeroDigitos++;
      }

      // System.out.println(copiaNumero); //AYUDA

      // La segunda parte del numero
      long numeroAuxiliar = numero;
      long numeroUltimaParte = copiaNumero;

      while (numeroAuxiliar != 0) {
        numeroAuxiliar /= 10;
        contador++;
      }

      // System.out.println(contador); //AYUDA

      for (int i = 0; i < (contador - numeroDigitos - 1); i++) {
        numeroUltimaParte *= 10;
      }

      long resta = numero - numeroUltimaParte;
      System.out.println(resta); //AYUDA

      System.out.print("El número resultante es " + copiaNumero);
      System.out.print(digitoInsertado);
      System.out.print(resta + ".");

    } catch (Exception e) {
      System.out.println(""); //SALTO DE LINEA 
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); //SALTO DE LINEA 
    }
  }
}
