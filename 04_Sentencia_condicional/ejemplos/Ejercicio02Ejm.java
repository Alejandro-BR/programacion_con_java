/**
 * Ejercicio 2 Ejemplo: Escribe un programa que solicite por teclado el numero de mes y muestre por pantalla el nombre. 
 * Asi, si introduce el valor 5 se mostrara MAYO. 
 * Si el valor introducido no se corresponde con el de un mes, se mostrara un mensaje de error.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class Ejercicio02Ejm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Introduce el numero del mes: ");
    int mes = sc.nextInt();
    sc.close(); 

    switch (mes) {
      case 1:
        System.out.println("Enero");
        break;
      case 2:
        System.out.println("Febrero");
        break;
      case 3:
        System.out.println("Marzo");
        break;
      case 4:
        System.out.println("Abril");
        break;
      case 5:
        System.out.println("Mayo");
        break;
      case 6: 
        System.out.println("Junio");
        break;
      case 7:
        System.out.println("Julio");
        break;
      case 8: 
        System.out.println("Agosto");
        break;
      case 9:
        System.out.println("Septiembre");
        break;
      case 10: 
        System.out.println("Octubre");
        break;
      case 11:
        System.out.println("Noviembre");
        break;
      case 12: 
        System.out.println("Diciembre");
        break;
      default:
        System.out.println("Introduce un numero correspondiente a un mes del año (1-12)");
        break;
    }
  }
}
