/**
 * Ejercicio 8: Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio08 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc
    System.out.print("Introduce el numero que quieras saber su tabla de multiplicacion: ");
    int numero = sc.nextInt();
    System.out.println(""); //SALTO DE LINEA
    sc.close(); //Cierre del Scanner 
    for(int i = 0; i <= 10; i++){
      System.out.printf("%2d%3s%2d%3s%2d \n",numero, " x ", i, " = ", (i * numero)); 
    }
    System.out.println(""); //SALTO DE LINEA 
  }
}
