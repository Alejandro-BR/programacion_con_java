/**
 * Ejercicio 28: Escribe un programa que calcule el factorial de un numero entero leido por teclado.
 * 
 * Ejemplo:
 * 
 * Por favorm introduzca un nuero entero: 6
 * 6! = 720
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio28 {
  public static void main(String[] args) {
    int factorial = 1;

    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Por favor, introduzca un numero entero: ");
    int numero = sc.nextInt();
    sc.close(); //Cierre del Scanner 
    System.out.println(""); //SALTO DE LINEA 

    for (int i = 1; i <= numero; i ++){
      factorial *= i;
    }

    System.out.printf("%1d != %3d \n",numero, factorial); 
    System.out.println(""); //SALTO DE LINEA 
  }
}
