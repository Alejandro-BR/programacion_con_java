/**
 * Ejercicio 68: Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar. Usa long en lugar de int donde sea necesario para admitir números largos.
 * 
 * Ejemplo 1:
 * 
 * Por favor, introduzca un número: 9402
 * Dislocando el 9402 sale el 8513.
 * 
 * Ejemplo 2:
 * 
 * Por favor, introduzca un número: 870958422
 * Dislocando el 870958422 sale el 961849533.
 * 
 * Ejemplo 3:
 * 
 * Por favor, introduzca un número: 137
 * Dislocando el 137 sale el 26
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio68 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.println("Por favor, introduzca un número: ");
    int numeroIntroducido = sc.nextInt();
    sc.close(); //Cierre del Scanner 
  }
}
