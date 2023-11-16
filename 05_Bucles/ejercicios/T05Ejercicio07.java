/**
 * Ejercicio 7: Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio07 {
  public static void main(String[] args) {
    int contraseñaIntroducida;
    int contraseña = 1234;
    int intentos = 4;

    System.out.println(""); //SALTO DE LINEA 
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    do{
      System.out.print("Introduce la contraseña: ");
      contraseñaIntroducida = sc.nextInt();
      intentos--;
      if (contraseñaIntroducida == contraseña) {
        System.out.println("Introduciste la contraseña correcta.");
      } else {
        System.out.println("Introduciste una contraseña incorrecta. Te quedan " + intentos + " intentos." );
      }
    } while ((contraseñaIntroducida != contraseña ) && (intentos > 0));
    sc.close(); //Cierre del Scanner 
    
    System.out.println(""); //SALTO DE LINEA 
  }
}
