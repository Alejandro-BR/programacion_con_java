/**
 * Ejercicio 27: Escribe un programa que muestre, cuente y sume los multiplos de 3 que hay entre 1 y un numero leido por teclado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio27 {
  public static void main(String[] args) {
    double resto;
    int multiplos = 0;
    int suma = 0;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Del numero introducido por pantalla este programa dira los multiplos que hay desde el numero hasta 1:");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el numero: ");
    int numero = sc.nextInt();
    System.out.println(""); //SALTO DE LINEA 
    sc.close(); //Cierre del Scanner 

    for (int i = numero; i >= 1; i--){
      resto = i % 3;
      if (resto == 0) {
        System.out.println(i);
        multiplos++;
        suma += i;
      }
    }

    System.out.println(""); //SALTO DE LINEA 
    System.out.printf("Hay %1d numeros multiplos de 3 entre el numero %2d y 1. \n",multiplos, numero); 
    System.out.println("La suma de todos los multiplos de tres es: " + suma); 
    System.out.println(""); //SALTO DE LINEA 
  }
}
