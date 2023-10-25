/**
 * Ejercicio 4: Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T02Ejercicio04 {
  public static void main(String[] args) {
    
    final double euros = 6.00;    //si lo poness con final lo pone como constante
    int pesetas = (int) (euros * 166.386); // 166.386 pecetas = 1 euro
    
    System.out.println(euros + " euros =  " + pesetas + " pecetas.");

  //System.out.println(euros + "€  --> " + pesetas + " pta");
  //System.out.printf("%.2f € --> %d pta\n", euros + pesetas);

  }
}
