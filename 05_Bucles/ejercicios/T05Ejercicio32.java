/**
 * Ejercicio 32: Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * 
 * Ejemplo 1:
 * 
 * Por favor, introduzca un número entero positivo: 94026782
 * Dígitos pares: 4 0 2 6 8 2
 * Suma de los dígitos pares: 22
 * 
 * Ejemplo 2:
 * 
 * Por favor, introduzca un número entero positivo: 31779
 * Dígitos pares:
 * Suma de los dígitos pares: 0
 * 
 * Ejemplo 3:
 * 
 * Por favor, introduzca un número entero positivo: 2404
 * Dígitos pares: 2 4 0 4
 * Suma de los dígitos pares: 10
 * 
 * 
 * No me sale no entiendo como hacerlo mirar mas adelante o preguntar en clase
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio32 {
  public static void main(String[] args) {
    long numeroIntroducido = 0;
    long ultimoDigito = 0;
    int contador = 0;

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Por favor, introduzca un número entero positivo: ");
    numeroIntroducido = sc.nextLong();
    sc.close(); //Cierre del Scanner 
    
    ultimoDigito = numeroIntroducido;

    while (ultimoDigito > 10) {
      ultimoDigito = ultimoDigito - ( numeroIntroducido / 10);
    }

    System.out.println(ultimoDigito);
    System.out.println(contador);
    System.out.println(""); //SALTO DE LINEA 
  }
}
