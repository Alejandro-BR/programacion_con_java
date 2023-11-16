/**
 * Ejercicio 13: Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio13 {
  public static void main(String[] args) {
    int numero;
    int positivos = 0;
    int negativos = 0;

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    System.out.println(""); //SALTO DE LINEA 

    for (int i = 1; i <= 10; i++) {
      System.out.print("Introduce el numero: ");
      numero = sc.nextInt();
      if (numero > 0) {
        positivos++;
      } else if (numero < 0) {
        negativos++;
      }
    }

    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Numeros positivos: " + positivos);
    System.out.println("Numeros negativos: " + negativos);
    System.out.println(""); //SALTO DE LINEA 

  }
}
