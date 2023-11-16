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
    int numeroSumado;
    int numeroSumado2;
    int suma = 0;
    int numero;
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    do {
      System.out.print("Introduce el numero entero: ");
      numero = sc.nextInt();
    } while(numero < 0);

    sc.close(); //Cierre del Scanner
    numeroSumado = numero; 
    for (int i = 0; i <= 100; i++){
      numeroSumado2 = numeroSumado;
      numeroSumado++;
      suma = numeroSumado + numeroSumado2;
    }

    System.out.println("Total = " + suma);
    System.out.println(""); //SALTO DE LINEA 
  }
}
