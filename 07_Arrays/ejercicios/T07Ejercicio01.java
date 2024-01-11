/**
 * Ejercicio 1: Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.InputMismatchException;
public class T07Ejercicio01 {
  public static void main(String[] args) {
    try {
      int num[] = new int[12];
      
      num[0] = 39;
      num[1] = -2;
      num[4] = 0;
      num[6] = 14;
      num[8] = 5;
      num[9] = 120;
      
      System.out.println(); //SALTO DE LINEA 
      
      for (int i = 0; i < num.length; i++) {
        System.out.println((i + i) + " --> " + num[i]);
      }
      
      System.out.println(); //SALTO DE LINEA 
      
      
    } catch (InputMismatchException ime) {
      System.out.println();
      System.out.println("Introduciste simbolos en vez de numero.");
      System.out.println("Mensaje de error: " + ime.getMessage());
      System.out.println("Clase del error: " + ime.getClass());
      System.out.println();
    //Letras en vez de numeros
    } catch (Exception e) {
      System.out.println();
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase del error: " + e.getClass());
      System.out.println();
    }
  }
}
