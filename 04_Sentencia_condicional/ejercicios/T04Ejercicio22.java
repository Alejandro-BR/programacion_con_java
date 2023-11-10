/**
 * Ejercicio 22:  Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio22 {
  public static void main(String[] args) {

    final int MINUTOSTOTALES = (4* 24 * 60) + (15 * 60);  //Calculamos minutos desde el lunes 00:00 hasta el viernes 15:00
    int diasTrascurridos = 0;

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Por favor, introduce un dia de la semna (de lunes a viernes): ");
    String dia = sc.nextLine();

    //Ver cuantos dias han tracurrido desde lunes 00:00

    switch (dia) {
      case "lunes":
        diasTrascurridos = 0;
        break;
      case "martes":
        diasTrascurridos = 1;
        break;
      case "miércoles":
      case "miercoles":
        diasTrascurridos = 2;
        break;
      case "jueves":
        diasTrascurridos = 3;
        break;
      case "viernes":
        diasTrascurridos = 4;
        break;
      default:
        System.out.println("No has introducido un valor correcto");
        break;
    }

    System.out.print("Introduce una hora: ");
    int horas = sc.nextInt();
    System.out.print("Introduce los minutos");
    int minutos = sc.nextInt();

    int minutosTrascurridos = (diasTrascurridos * 24 * 60) + (horas * 60 + minutos);
    System.out.println("Faltan " + (MINUTOSTOTALES - minutosTrascurridos) + " minutos para llegar al fin de semana");

    sc.close(); //Cierre del Scanner 
  }
}
