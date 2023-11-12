/**
 * Ejercicio 27: Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 * 
 * Ejemplo 1:
 * 
 * Elija un sabor (manzana, fresa o chocolate): chocolate
 * ¿Qué tipo de chocolate quiere? (negro o blanco): negro
 * ¿Quiere nata? (si o no): si
 * ¿Quiere ponerle un nombre? (si o no): no
 * Tarta de chocolate negro: 14,00 €
 * Con nata: 2,50 €
 * Total: 16,50 €
 * 
 * Ejemplo 2:
 * 
 * Elija un sabor (manzana, fresa o chocolate): manzana
 * ¿Quiere nata? (si o no): no
 * ¿Quiere ponerle un nombre? (si o no): si
 * Tarta de manzana: 18,00 €
 * Con nombre: 2,75 €
 * Total: 20,75 €
 * 
 * Ejemplo 3:
 * 
 * Elija un sabor (manzana, fresa o chocolate): fresa
 * ¿Quiere nata? (si o no): si
 * ¿Quiere ponerle un nombre? (si o no): si
 * Tarta de fresa: 16,00 €
 * Con nata: 2,50 €
 * Con nombre: 2,75 €
 * Total: 21,25 €
 * 
 * @author Alejandro Barrionuevo Rosado
 */
/**
 * T04Ejercicio27
 */
import java.util.Scanner; 
public class T04Ejercicio27 {
  public static void main(String[] args) {

    String sabor;
    String chocolate = "";
    String nata;
    String nombre;
    double precio = 0;

    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    sabor = sc.next();
    if (sabor.equals("chocolate")) {
      System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
      chocolate = sc.next();
    }
    System.out.print("¿Quiere nata? (si o no): ");
    nata = sc.next();
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    nombre = sc.next();
    sc.close(); //Cierre del Scanner 

    switch (sabor) {
      case "manzana":
        precio = 18.00;
        break;
      case "fresa":
        precio = 16.00;
        break;
      case "chocolate":
        switch (chocolate) {
          case "negro":
            precio = 14.00;
            break;
          case "blanco":
            precio = 15.00;
            break;
        }
      default:
        break;
    }


    if (sabor.equals("chocolate")) {
      System.out.printf("%-8s %10s %7s %7.2f €\n","Tarta de",sabor,chocolate,precio); 
    } else {
      System.out.printf("%-6s %6s: %7.2f €\n","Tarta de",sabor,precio); 
    }
    
    if (nata.equals("si")) {
      System.out.println("Con nata: 2.50 €");
      precio = precio + 2.50;
    }

    if (nombre.equals("si")) {
      System.out.println("Con nombre: 2.75 €");
      precio = precio + 2.75;
    }

    System.out.printf("%-6s %5.2f €\n","Total:",precio); 
  }
}
