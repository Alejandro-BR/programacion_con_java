/**
 * Ejercicio 4: sEscribe un programa que muestre tu horario de clase
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T01Ejercicio04 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA
    System.out.println(""); //SALTO DE LINEA
    System.out.printf("%-35s %s","", "HORARIO 1ºDAW");
    System.out.println(""); //SALTO DE LINEA
    System.out.println(""); //SALTO DE LINEA
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| Horario", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes |");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 15:15-16:15", "FOL", "PROGR", "ENDES", "BADAT", "PROGR   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 16:15-17:15", "FOL", "PROGR", "ENDES", "BADAT", "PROGR   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 17:15-18:15", "FOL", "BADAT", "BADAT", "LMSGI", "ENDES   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 18:15-18:30", "RECREO", "RECREO", "RECREO", "RECREO", "RECREO  |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 18:30-19:30", "SIINF", "BADAT", "BADAT", "LMSGI", "SNINF   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 19:30-20:30", "SIINF", "LMSGI", "PROGR", "PROGR", "SNINF   |");
    System.out.printf("%-16s %-14s %-14s %-14s %-14s %-14s \n",  "| 20:30-21:30", "SIINF", "LMSGI", "PROGR", "PROGR", "SNINF   |");
    System.out.println("--------------------------------------------------------------------------------------");
  } 
} 

