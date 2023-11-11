/**
 * Ejercicio 17: Escribe un programa que diga cual es la ultima cifra de un numero entero introducido por teclado
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio17 {
  public static void main(String[] args) {
    int ultimoDigito;
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Ultima cifra de un numero entero: ");
    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el numero entero: ");
    int numero = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    ultimoDigito = numero % 10;
    
    System.out.println(""); //SALTO DE LINEA
    System.out.println("El ultimo digito es " + ultimoDigito);
    System.out.println(""); //SALTO DE LINEA
  }
}
