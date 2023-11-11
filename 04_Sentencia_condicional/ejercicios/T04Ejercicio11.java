/**
 * Ejercicio 11: Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan
 * para llegar a la medianoche.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio11 {
  public static void main(String[] args) {
    final int HORAS12 = 43200; //12 HORAS SON 43.200 SEGUNDOS
    
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("¿CUANTO QUEDA PARA QUE SEA LAS 12 DE LA NOCHE? \033[33m 12:00 PM ◯ \033[0m");
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Recuerda el formato de las horas sera en AM y PM");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce si la hora sera dentro de AM o PM: ");
    String horario = sc.nextLine();
    System.out.print("Introduce la hora: ");
    int hora = sc.nextInt();
    System.out.print("Introduce los minutos: ");
    int minutos = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 

    
    int segundos = ((hora * 60) + minutos) * 60; 

    if (((hora >= 1) && (hora <= 12)) && ((minutos >= 0) && (minutos <= 59))) {
      switch (horario) {
        case "PM", "pm":
          System.out.println("Son las " + hora + ":" + minutos + " " + horario);
          System.out.println("Faltan " + (HORAS12 - segundos) + " segundos para las 12:00 PM");
          break;
        case "AM", "am":
          System.out.println("Son las " + hora + ":" + minutos + " " + horario);
          System.out.println("Falta " + (2 * HORAS12 - segundos) + " segundos para las 12:00 PM ");
          break;
        default:
          System.out.println("\033[31mNo introduciste correctamente los valores AM o PM.\033[0m");
          break;
      }
    } else {
      System.out.println("\033[31mNo introduciste correctamente las horas y minutos.\033[0m");
    }

    System.out.println(""); //SALTO DE LINEA 

  }
}
