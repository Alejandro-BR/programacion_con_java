/**
 * Ejercicio 23: Escribe un programa que permita ir introduciendo una serie indeterminada de numeros mientras su suma
 * no supere el valor 10000. Cuando eso ultimo ocurra, se debe mostra el total acumulado, el contador de los numeros
 * introducidos y la media.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio23 {
  public static void main(String[] args) {
    int numero;
    int suma = 0;
    int cantidad = 0;

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Se introducira numeros hasta que la suma no supere los 10000.");
    System.out.println(""); //SALTO DE LINEA

    do {
      System.out.print("Introduce un numero: ");
      numero = sc.nextInt();
      suma += numero;
      cantidad++;
    } while(suma <= 10000);

    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA
    System.out.println("Cantidad de numeros introducidos: " + cantidad);
    System.out.println("Suma total de todos los numeros introducidos: " + suma);
    System.out.println("Media de todos los numeros introducidos: " + (suma / cantidad));
    System.out.println(""); //SALTO DE LINEA 
    
  }
}
