
/**
 * Ejercicio 46: Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * 
 * Ejemplo 1:
 * 
 * Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
 * Ahora introduzca la altura (como mínimo 2): 1
 * Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.
 * 
 * Ejemplo 2:
 * 
 * Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
 * Ahora introduzca la altura (como mínimo 2): 4
 * * * * * * *
 * *         *
 * *         *
 * * * * * * *
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class T05Ejercicio46 {
  public static void main(String[] args) {
    try {
      int anchura;
      int altura;

      Scanner sc = new Scanner(System.in); // Creamos un objetos de la clase Scanner, llamado sc

      System.out.println(""); //SALTO DE LINEA 

      System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
      anchura = sc.nextInt();

      System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
      altura = sc.nextInt();

      System.out.println(""); //SALTO DE LINEA 

      sc.close(); // Cierre del Scanner

      if ((anchura >= 2) && (altura >= 2)) {

        //Primera fila (anchura)
        for (int i = 1; i <= anchura; i++) {
          System.out.print("* ");
        }
        System.out.println(""); //SALTO DE LINEA 

        //Centro (altura)
        for (int i = 1; i <= altura - 2; i++) {
          System.out.print("*"); //Primer * de cada fila

          //Centro al cual le quito dos del principio y final y lo multiplico por dos y un tercen digito que no se muy bien porque pero sin el lo cuadra mal
          for (int j = 1; j <= (anchura * 2 - 3); j++) { 
            System.out.print(" ");
          }

          System.out.println("*"); //Ultimo * de cada fila
        }

        //Ultima fila (anchura)
        for (int i = 1; i <= anchura; i++) {
          System.out.print("* ");
        }

      } else {
        System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
      }

      System.out.println(""); // SALTO DE LINEA
      System.out.println(""); // SALTO DE LINEA

    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
