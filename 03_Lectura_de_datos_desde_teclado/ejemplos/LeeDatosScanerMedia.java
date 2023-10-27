import java.util.Scanner;
import java.util.Locale;  //Importar para poder usar decimales

/**
 * Leer datos con Scaner y calcular una media.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class LeeDatosScanerMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Creamos un objetos de la clase Scanner, llamado sc
    System.out.print("Introduce los tres numeros (Con o sin decimales) que deseas que le haga la media (Separados por un espacio cada numero): ");
    
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    double num3 = sc.nextDouble();

    double media = ((num1 + num2 + num3) / 3.0);
    System.out.println("Los numeros son " + num1 + ", " + num2 + ", " + num3 + " y su media es " + media );
  }
}
