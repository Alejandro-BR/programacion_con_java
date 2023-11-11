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
    System.out.printf("\033[0;35m%-10s %11s %10s\033[0m\n","------"," HOROSCOPO ","------"); 
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce tu mes de nacimeiento: ");
    String mes = sc.nextLine();
    System.out.print("Introduce tu dia de nacimeient: ");
    int dia = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA

    switch (mes) {
      case "Marzo":
      case "marzo":
        if (dia >= 21) {
          System.out.println("Tu signo es ARIES ♈");
        } else if (dia <= 20) {
          System.out.println("Tu signo es PISCiS ♓ ");
        }
        break;
      case "Abril":
      case "arbil":
        if (dia <= 20) {
          System.out.println("Tu signo es ARIES ♈");
        } else if (dia >= 21) {
          System.out.println("Tu signo es TAURO ♉ ");
        }
        break;
      case "Mayo":
      case "mayo":
        if (dia <= 21) {
          System.out.println("Tu signo es TAURO ♉ ");
        } else if (dia >= 22) {
          System.out.println("Tu signo es GEMINIS ♊ ");
        }
        break;
      case "Junio":
      case "junio":
        if (dia <= 22) {
          System.out.println("Tu signo es GEMINIS ♊ ");
        } else if (dia >= 23) {
          System.out.println("Tu signo es CANCER ♋ ");
        }
        break;
      case "Julio":
      case "julio":
        if (dia <= 23) {
          System.out.println("Tu signo es CANCER ♋ ");
        } else if (dia >= 24) {
          System.out.println("Tu signo es LEO ♌ ");
        }
        break;
      case "Agosto":
      case "agosto":
        if (dia <= 23 ) {
          System.out.println("Tu signo es LEO ♌ ");
        } else if (dia >= 24) {
          System.out.println("Tu signo es VIRGO ♍ ");
        }
        break;
      case "Septiembre":
      case "septiembre":
        if (dia <= 23) {
          System.out.println("Tu signo es VIRGO ♍ ");
        } else if (dia >= 24) {
          System.out.println("Tu signa es LIBRA ♎ ");
        }
        break;
      case "Obtubre":
      case "octubre":
        if (dia <= 23) {
          System.out.println("Tu signa es LIBRA ♎ ");
        } else if (dia >= 24) {
          System.out.println("Tu signo es ESCORPIO ♏ ");
        }
        break;
      case "Noviembre":
      case "noviembre":
        if (dia <= 22) {
          System.out.println("Tu signo es ESCORPIO ♏ ");
        } else  if (dia >= 23) {
          System.out.println("Tu signo es SAGITARIO ♐ ");
        }
        break;
      case "Diciembre":
      case "diembre":
        if (dia <= 21) {
          System.out.println("Tu signo es SAGITARIO ♐ ");
        } else if (dia >= 22) {
          System.out.println("TU signo es CAPRICORNIO ♑ ");
        }
        break;
      case "Enero":
      case "enero":
        if (dia <= 20) {
          System.out.println("TU signo es CAPRICORNIO ♑ ");
        } else if (dia >= 21) {
          System.out.println("Tu signo es ACUARIOS ♒ ");
        }
        break;
      case "Febrero":
      case "febrero":
        if (dia <= 19) {
          System.out.println("Tu signo es ACUARIOS ♒ ");
        } else if (dia >= 20) {
          System.out.println("Tu signo es PISCiS ♓ ");
        }
        break;
      default:
        System.out.println("\033[31mNo introduciste un mes o dia valido. \033[0m");
        break;
    }

    System.out.println(""); //SALTO DE LINEA 
  }
}
