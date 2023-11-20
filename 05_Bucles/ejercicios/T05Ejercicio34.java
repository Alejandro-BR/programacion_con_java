/**
 * Ejercicio 34: Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando los
 * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 * int donde sea necesario para admitir números largos.
 * 
 * Ejemplo 1:
 * 
 * Por favor, introduzca un número: 9402
 * Introduzca otro número: 6782
 * El número formado por los dígitos pares es 640822
 * El número formado por los dígitos impares es 97
 * 
 * Ejemplo 2:
 * 
 * Por favor, introduzca un número: 137
 * Introduzca otro número: 909
 * El número formado por los dígitos pares es 0
 * El número formado por los dígitos impares es 19379
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Por favor, introduzca un número: ");
    long num1 = sc.nextLong();
    System.out.print("Introduce otro numero: ");
    long num2 = sc.nextLong();
    sc.close(); //Cierre del Scanner 

    

  }
}

