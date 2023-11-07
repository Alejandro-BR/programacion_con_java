/**
 * Problema 2: Uno de los factores que mide la vita útil de un disco duro SSD es la cantidad de TWB (TeraBytes Written). 
 * Así, un SSD Crucial MX500 con 360 TWB, si queremos que tenga una vida útil de 10 años, 
 * puedes escribir como máximo aproximadamente 0.0986 terabytes (98.6 GB) de datos por día.
 * Implemente un programa que pida la cantidad del factor TWB de un disco duro SSD y que calcule el número de terabytes (TB)
 * y su equivalencia en gigabytes GB de datos que podemos escribir por día como máximo si deseas que tu SSD dure 6 años.
 * NOTA: Considera, por defecto, que un año son 365 días.
 * Ejemplo de salida:
 * VIDA ÚTIL SSD
 * =========
 * Introduzca el factor TBW de tu disco duro SSD: 360
 * La cantidad máxima de terabytes que puedes escribir por día es: 0.0986 TB (98.6 GB)
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class Problema02 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduzca el factor TBW de tu disco duro SSD: ");
    int tbw = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    //CALCULOS
    double tb = tbw / (365 * 10);
    double gb = tb * 1000;

    System.out.println("La cantidad máxima de terabytes que puedes escribir por día es:" + tb + "TB" + "(" + gb + " GB)");

    System.out.println(""); //SALTO DE LINEA 
  }
}
