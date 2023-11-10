/**
 * Ejercicio 10: Escribe un programa que nos diga el horoscopo a partir del dia y el mes de nacimiento.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
/** Signos del zodiaco
 * ARIES ♈ 	
 * TAURUS ♉ 
 * GEMINI	♊
 * CANCER	♋
 * LEO	♌
 * VIRGO	♍
 * LIBRA	♎
 * SCORPIUS	♏
 * SAGITTARIUS	♐
 * CAPRICORN	♑
 * AQUARIUS	♒
 * PISCES	♓
 */
import java.util.Scanner; 
public class T04Ejercicio10 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA
    System.out.println("------ HOROSCOPO ------");
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce tu mes de nacimeiento (en minuscla): ");
    String mes = sc.nextLine();
    System.out.print("Introduce tu dia de nacimeient: ");
    int dia = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA

    switch (mes) {
      case "marzo":
        if (dia >= 21) {
          System.out.println("Tu signo es ARIES ♈");
        } else if (dia >= 1) {
          System.out.println("Tu signo es PISCiS ♓ ");
        }
        break;
      case "arbil":
      if (dia <= 20) {
        System.out.println("Tu signo es ARIES ♈");
      } else if (dia >= 21) {
        System.out.println("Tu signo es TAURO ♉ ");
      }

      default:
        break;
    }


  }
}
