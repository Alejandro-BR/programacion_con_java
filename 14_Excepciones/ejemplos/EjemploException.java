/**
 * Ejemplo de Exception e
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class EjemploException {
  public static void main(String[] args) {
    double numero1;
    double numero2;
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    try {
      System.out.print("Introduzzca el primer numero: ");
      numero1 = Double.parseDouble(sc.nextLine());
      System.out.print("Introduzzca otro numero: ");
      numero2 = Double.parseDouble(sc.nextLine());
      System.out.println("La media es " + (numero1 + numero2) / 2);
      sc.close(); //Cierre del Scanner 
    }
    catch (NumberFormatException nfe) {
      System.out.println("No se pueden introducir caracteres");
    } catch (Exception e){
      System.out.println("No se puede calcular la media.");
      System.out.println("Los datos introducidos no son correcto.");
    }finally {
      System.out.println("Gracias por utilizar este programa.");
    }

  }
}

//Exception e     es la general
//NumberFormatException nfe     es de numeros