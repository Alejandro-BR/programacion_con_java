/**
 * Problema 3: Escribe un programa que convierta una cantidad de días a su equivalente en años, meses y días. 
 * Al final de la pregunta se te proporciona la tabla de códigos de colores. También puedes usar el selector de color de Google.
 *
 * NOTA: Considera que cada 30 días, se considera 1 mes.
 *
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class Problema03 {
  public static void main(String[] args) {

    int diasr;
    int años;
    int meses;

    System.out.println("\033[1;37mCALCULADORA DE TIEMPO \033[0m");
    System.out.println("=====================");
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce una cantidad de días: ");
    int dias = sc.nextInt();
    sc.close(); //Cierre del Scanner
    
    // años = (dias / 30) / 12;
    // meses = (dias * 30) - (años * 12);
    // diasr = dias - (meses * 30);

    // if (dias > 360) {
    //   años = (dias / 30) / 12;
    //   meses = dias * 30;
    //   if (meses > 12) {
    //     double meses2 = meses - (12 * años)
    //   } else if (meses == 12) {
    //     double meses0 = 0;
    //   }
    // }

    años = (dias / 30) / 12;
    //System.out.println(años);
    meses = (dias / 30) - (12 * años);
    //System.out.println(meses);
    diasr = dias - (30 * meses);
    //System.out.println(diasr);

    System.out.println(dias + " días son \033[48;5;196m" + años + "\033[0m años, \033[48;5;190m " + meses + "\033[0m meses y \033[48;5;82m " + diasr + "\033[0m dias." );
  }
}
