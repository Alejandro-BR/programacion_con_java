package Ejercicio08;
import java.util.ArrayList;

/**
 * Ejercicio 8: Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class MainCarta {
  
  public static void main(String[] args) {
    ArrayList<Carta> baraja = new ArrayList<>();

    Carta c = new Carta();
    baraja.add(c);

    for (int i = 0; i < 9; i++) {
      do {
        Carta nueva = new Carta();
      } while ();
    }
  }
}
