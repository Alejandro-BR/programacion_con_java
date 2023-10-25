/**
 * Ejercicio 5: Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T02Ejercicio05 {
  public static void main(String[] args) {
    
    int pesetas = 1000 ;
    double euros = (pesetas / 166.386);
    
    /* Intentos fallidos hasta encontrar la solucion
     * System.out.println (pesetas + " pecetas =  " + euros + " euros.");
     * System.out.printf(" %.3f","" + pesetas + " pecetas =  " + euros + " euros.");
     * System.out.printf("%.3f","euros");
     */
    
    System.out.println(""); //Espacios
    System.out.print (pesetas + " pesetas = ");
    System.out.printf(" %.2f", euros ); 
    System.out.println(" euros.");
    System.out.println(""); //Espacios
  }
}
