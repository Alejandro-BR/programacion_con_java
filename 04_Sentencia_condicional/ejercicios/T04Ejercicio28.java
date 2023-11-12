/**
 * Ejercicio 28: Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 * 
 * Ejemplo 1:
 * 
 * Turno del jugador 1 (introduzca piedra, papel o tijera): papel
 * Turno del jugador 2 (introduzca piedra, papel o tijera): papel
 * Empate
 * 
 * Ejemplo 2:
 * 
 * Turno del jugador 1 (introduzca piedra, papel o tijera): papel
 * Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
 * Gana el jugador 2
 * 
 * Ejemplo 3:
 * 
 * Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
 * Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
 * Gana el jugador 1
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio28 {
  public static void main(String[] args) {
    String jugador1;
    String jugador2;

    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    jugador1 = sc.next();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    jugador2 = sc.next();
    sc.close(); //Cierre del Scanner 
    
    if (((jugador1.equals("piedra"))&&(jugador2.equals("tijera"))) || ((jugador1.equals("papel"))&&(jugador2.equals("piedra"))) || ((jugador1.equals("tijera"))&&(jugador2.equals("papel")))) {
      System.out.println("Gana jugador 1");
    } else if (((jugador1.equals("piedra"))&&(jugador2.equals("piedra"))) || ((jugador1.equals("papel"))&&(jugador2.equals("papel"))) || ((jugador1.equals("tijera"))&&(jugador2.equals("tijera")))) {
      System.out.println("Empate");
    } else if (((jugador2.equals("piedra"))&&(jugador1.equals("tijera"))) || ((jugador2.equals("papel"))&&(jugador1.equals("piedra"))) || ((jugador2.equals("tijera"))&&(jugador1.equals("papel")))) {
      System.out.println("Gana jugador 2");
    } else {
      System.out.println("Introduce valores correctos");
    }

    System.out.println(""); //SALTO DE LINEA 
    
  }
}
