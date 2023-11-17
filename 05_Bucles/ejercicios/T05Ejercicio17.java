/**
 * Ejercicio 17: Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio17 {
  public static void main(String[] args) {
    int suma = 0;
    int numero;
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    do {
      System.out.print("Introduce el numero entero positivo: ");
      numero = sc.nextInt();
    } while(numero <= 0);

    sc.close(); //Cierre del Scanner 
    for (int i = numero + 1; i <= numero + 100; i++){
      suma += i;
    }

    System.out.println("Total = " + suma);
    System.out.println(""); //SALTO DE LINEA 
  }
}
