/**
 * Ejercicio 3: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 * nombre del día de la semana.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio03 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el dia de la semana (1-7): ");
    int dia = sc.nextInt();
    sc.close(); //Cierre del Scanner
    System.out.println(""); //SALTO DE LINEA 

    switch (dia) {
      case 1:
        System.out.println("\033[94mLunes");
        break;
      case 2:
        System.out.println("\033[93mMartes");
        break;
      case 3:
        System.out.println("\033[92mMiercoles");
        break;
      case 4:
        System.out.println("\033[95mJueves");
        break;
      case 5:
        System.out.println("\033[96mViernes");
        break;
      case 6: 
        System.out.println("\033[36mSabado");
        break;
      case 7:
        System.out.println("\033[33mDomingo");
        break;
      default:
        System.out.println("\033[31mIntroduce un dia de la semana, el numero " + dia + " no es valido.");
        break;
    }
    System.out.println("\033[0m");
  }
}
