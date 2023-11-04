/**
 * Ejercicio 2: Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
//import colors.ConsoleColors; 
import java.util.Scanner; 
public class T04Ejercicio02 {
  public static void main(String[] args) {  

    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce la hora que es: ");
    int hora = sc.nextInt();
    sc.close(); //Cierre del Scanner

    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("¡Buenos dias!");
    } else if ((hora >= 13) && (hora <= 20)) {
      System.out.println("¡Buenas tardes!");
    }else if ((hora >= 21) && (hora <= 5)) {
      System.out.println("¡Buenas noches!");
    }else{
      System.out.println("Introduce una hora valida");
    }

    System.out.println(""); //SALTO DE LINEA 
  }
}
