/**
 * Ejercicio 30: Realiza un programa que calcule las horas trascurridas entre dos horas de dos dias de la semana.
 * No se tendran en cuenta los minutos ni los segundos.
 * El de la de la semana se puede pedir con un numero (del 1 al 7) o como una cadena (de "lunes" a "domingo"). Se debe comrpobar
 * que el usuarios introduce los datos correctamente y que el segundo dia es posterior al primero.
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca la primera hora.
 * Dia: lunes
 * Hora: 18
 * Por favor, introduzca la segunda hora.
 * Dia: martes
 * Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s
 * 
 * No se como saber si un String es posterior a otro
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio30 {
  public static void main(String[] args) {
    String dia1 = "";
    int dia1Numero = 0;
    int hora1;
    String dia2 = "";
    int dia2Numero = 0;
    int hora2;


    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Por favor, introduzca la primera hora.");

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Dia: ");
    dia1 = sc.next();
    do {
      System.out.print("Hora: ");
      hora1 = sc.nextInt();
    } while (hora1 > 25);


    System.out.println("Por favor, introduzca la segunda hora.");
    System.out.print("Dia: ");
    dia2 = sc.next();
    do {
      System.out.print("Hora: ");
      hora2 = sc.nextInt();
    } while (hora2 > 25);

    sc.close(); //Cierre del Scanner 

    switch (dia1) {
      case "1", "lunes":
        dia1Numero = 1;
        break;
      case "2", "martes":
        dia1Numero = 2;
        break;
      case "3", "miercoles":
        dia1Numero = 3;
        break;
      case "4", "jueves":
        dia1Numero = 4;
        break;
      case "5", "viernes":
        dia1Numero = 5;
        break;
      case "6", "sabado":
        dia1Numero = 6;
        break;
      case "7", "domingo":
        dia1Numero = 7;
        break;
      default:
        System.out.println("No introduciste un dia correcto");
        break;
    }

    switch (dia2) {
      case "1", "lunes":
        dia1Numero = 1;
        break;
      case "2", "martes":
        dia1Numero = 2;
        break;
      case "3", "miercoles":
        dia1Numero = 3;
        break;
      case "4", "jueves":
        dia1Numero = 4;
        break;
      case "5", "viernes":
        dia1Numero = 5;
        break;
      case "6", "sabado":
        dia1Numero = 6;
        break;
      case "7", "domingo":
        dia1Numero = 7;
        break;
      default:
        System.out.println("No introduciste un dia correcto");
        break;
    }

    int suma1 = dia1Numero * 24 + hora1;
    int suma2 = dia2Numero * 24 + hora2;

    System.out.println(dia1Numero);
    System.out.println(dia2Numero);
    System.out.println(suma2 - suma1);

    System.out.println(""); //SALTO DE LINEA 
  }
}
