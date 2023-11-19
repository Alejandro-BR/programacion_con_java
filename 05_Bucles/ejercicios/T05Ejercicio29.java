/**
 * Ejercicio 29: Escribe un programa que muestre por pantalla todos los numeros enteros positivos menores a uno leido por teclado
 * que no sean divisibles entre otro tambien de igual forma.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio29 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Muestra por pantalal los numeros enteros positivos menores a uno leido por teclado");
    System.out.println("que no seam divisibles entro otro tambien de igual forma.");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Primer numero: ");
    int num1 = sc.nextInt();
    System.out.print("Segundo numero: ");
    int num2 = sc.nextInt();
    System.out.println(""); //SALTO DE LINEA 
    sc.close(); //Cierre del Scanner 
    
    for (int i = num1; i > 0; i--){
      if (i % num2 == 0) {
        System.out.println(i);
      }
    }

    System.out.println(""); //SALTO DE LINEA 
  }
}
