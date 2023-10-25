/**
 * Ejercicio 5: Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import colors.ConsoleColors; //biblioteca

public class T01Ejercicio05 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA
    System.out.println(""); //SALTO DE LINEA
    System.out.printf("%-35s %s","", "\033[1;36m HORARIO 1ºDAW"); //Titulo
    System.out.println(""); //SALTO DE LINEA
    System.out.println(ConsoleColors.BLUE_BOLD); //SALTO DE LINEA Y DAR COLOR 
    System.out.println("--------------------------------------------------------------------------------------\033[0m");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "|  Horario", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes |\033[1;34m");
    System.out.println("-------------------------------------------------------------------------------------- \033[0m");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 15:15-16:15\033[35m   ", "FOL\033[32m           ", "PROGR\033[36m         ", "ENDES\033[31m         ", "BADAT\033[32m         ", "PROGR\033[0m   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 16:15-17:15\033[35m   ", "FOL\033[32m           ", "PROGR\033[36m         ", "ENDES\033[31m         ", "BADAT\033[32m         ", "PROGR\033[0m   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 17:15-18:15\033[35m   ", "FOL\033[31m           ", "BADAT", "BADAT\033[30m         ", "LMSGI\033[36m         ", "ENDES\033[0m   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 18:15-18:30", "RECREO", "RECREO", "RECREO", "RECREO", "RECREO  |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 18:30-19:30\033[33m   ", "SIINF\033[31m         ", "BADAT", "BADAT\033[30m         ", "LMSGI\033[33m         ", "SNINF\033[0m   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 19:30-20:30\033[33m   ", "SIINF\033[30m         ", "LMSGI\033[32m         ", "PROGR", "PROGR\033[33m         ", "SNINF\033[0m   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 20:30-21:30\033[33m   ", "SIINF\033[30m         ", "LMSGI\033[32m         ", "PROGR", "PROGR\033[33m         ", "SNINF\033[0m   |\033[1;34m");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.println("\033[0m"); //SALTO DE LINEA Y RESETEO DE COLOR
  } 
}
